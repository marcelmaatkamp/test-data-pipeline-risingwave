{{ config(materialized='materialized_view') }}
SELECT * 
FROM {{ ref('ais_source') }} 
WHERE datetime > (SELECT MAX(datetime) - INTERVAL '10 minutes' FROM ais_source)
WITH NO DATA;