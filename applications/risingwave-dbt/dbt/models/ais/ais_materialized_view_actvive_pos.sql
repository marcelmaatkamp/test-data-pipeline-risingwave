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

SELECT * 
FROM {{ ref('ais_source') }} 
WHERE 
    datetime > (SELECT MAX(datetime) - INTERVAL '10 minutes' FROM ais_source)
WITH NO DATA;