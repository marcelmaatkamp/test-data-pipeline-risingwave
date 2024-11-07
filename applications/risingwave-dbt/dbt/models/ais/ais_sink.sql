{{ config(materialized='sink') }}

CREATE SINK {{ this }} AS
SELECT
   avg(length) as avg_length,
   avg(width) as avg_width
FROM ais_source
WITH (
   connector='kafka',
   properties.bootstrap.server='redpanda:29092',
   topic='test'
)
FORMAT PLAIN ENCODE JSON (
   force_append_only='true'
);