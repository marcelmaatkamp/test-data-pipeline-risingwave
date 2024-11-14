{{ config(materialized='materialized_view') }}
    select * from ais_source 
    where sog > 10;