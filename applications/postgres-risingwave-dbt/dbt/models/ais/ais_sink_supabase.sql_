
{{ config(materialized='sink') }}

CREATE SINK {{ this }} AS
WITH (
    connector = 'postgres',
    host = 'supabase',
    port = 5432,
    database = 'supabase',
    user = 'supabase',
    password = 'supabase',
    table = 'user_activity_logs',
    options = 'sslmode=require'
);