{{ config(materialized='sink') }}
CREATE SINK {{ this }}
FROM ais_materialized_view_exessive_speed 
WITH (
  connector='jdbc',
  jdbc.url='jdbc:postgresql://pocketbase:5432/postgres?user=postgres&password=postgres',
  table.name = 'promotions',
  type = 'upsert'
);