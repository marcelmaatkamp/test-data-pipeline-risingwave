{{ config(materialized='sink') }}

CREATE SINK {{ this }} AS
SELECT
   *
FROM {{ ref('ais_materialized_view_exessive_speed') }}
WITH (
   connector='kafka',
   properties.bootstrap.server='redpanda:29092',
   topic='test'
)
FORMAT PLAIN ENCODE JSON (
   force_append_only='true'
);


