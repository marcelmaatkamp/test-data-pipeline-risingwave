{{ config(materialized='sink') }}
CREATE SINK {{ this }}
FROM {{ ref('ais_materialized_view_active_events') }}  
WITH (
    connector = 'jdbc',
    jdbc.url = 'jdbc:postgresql://postgres:5432/metadata?user=postgres&password=postgres',
    table.name = 'ais_materialized_view_active_events',
    type = 'upsert',
    primary_key = 'mmsi'
);