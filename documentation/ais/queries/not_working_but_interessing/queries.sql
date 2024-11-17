CREATE MATERIALIZED VIEW ais_active_10m AS 
WITH latest_time AS (
    SELECT MAX(datetime) as max_datetime 
    FROM ais_source
),
filtered_data AS (
    SELECT 
        a.*,
        l.max_datetime
    FROM ais_source a
    CROSS JOIN latest_time l
    WHERE a.datetime > l.max_datetime - INTERVAL '10 minutes'
)
SELECT DISTINCT ON (mmsi)
    mmsi,
    datetime,
    lat,
    lon,
    sog,
    cog,
    vesselname,
    vesseltype,
    EXTRACT(EPOCH FROM (max_datetime - datetime))/60 as minutes_since_last_seen
FROM filtered_data
ORDER BY mmsi, datetime DESC;

# ----

CREATE MATERIALIZED VIEW ais_active_10m AS 
WITH recent_records AS (
    SELECT *,
           datetime as record_time,
           ROW_NUMBER() OVER (PARTITION BY mmsi ORDER BY datetime DESC) as rn
    FROM ais_source
    WHERE datetime > now() - INTERVAL '10 minutes'
)
SELECT 
    mmsi,
    datetime,
    lat,
    lon,
    sog,
    cog,
    vesselname,
    vesseltype,
    EXTRACT(EPOCH FROM (now() - datetime))/60 as minutes_since_last_seen
FROM recent_records
WHERE rn = 1;

# ----

CREATE MATERIALIZED VIEW ais_active_10m AS 
SELECT DISTINCT ON (mmsi)
    mmsi,
    datetime AT TIME ZONE 'UTC' as datetime,
    lat,
    lon,
    sog,
    cog,
    vesselname,
    vesseltype
FROM ais_source
WHERE datetime > (now() AT TIME ZONE 'UTC') - INTERVAL '10 minutes'
ORDER BY mmsi, datetime DESC;

# ----

CREATE MATERIALIZED VIEW ais_active_ships AS 
SELECT DISTINCT ON (mmsi)
    mmsi,
    datetime AT TIME ZONE 'UTC' as datetime,
    lat,
    lon,
    sog,
    cog,
    vesselname,
    vesseltype
FROM ais_source
ORDER BY mmsi, datetime DESC;