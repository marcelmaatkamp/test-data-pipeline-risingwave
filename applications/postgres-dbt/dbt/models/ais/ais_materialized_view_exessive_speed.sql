{{ config(materialized='materialized_view') }}
    select * from {{ ref('ais_source') }}
    where sog > 10;