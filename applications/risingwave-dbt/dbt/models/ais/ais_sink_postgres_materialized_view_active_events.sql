{{ config(materialized='sink') }}
CREATE SINK {{ this }}
FROM {{ ref('ais_materialized_view_active_events') }}  
WITH (
    connector = 'jdbc',
    jdbc.url = 'jdbc:postgresql://postgres-data/data?user=postgres&password=postgres',
    table.name = 'ais_position',
    type = 'upsert',
    primary_key = 'mmsi'
);