{{ config(materialized='materialized_view') }}
SELECT DISTINCT ON (mmsi)
    mmsi,
    datetime AT TIME ZONE 'UTC' as datetime,
    lat,
    lon,
    sog,
    cog,
    vesselname,
    vesseltype
FROM {{ ref('ais_source') }}
ORDER BY mmsi, datetime DESC;