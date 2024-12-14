{{ config(materialized='materialized_view') }}
SELECT DISTINCT ON (mmsi) *
FROM {{ ref('ais_source') }}
ORDER BY mmsi, datetime DESC;