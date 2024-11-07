{{ config(materialized='source') }}

create SOURCE {{ this }} (
    mmsi INTEGER,
    BaseDateTime TIMESTAMP,
    LAT DOUBLE PRECISION,
    LON DOUBLE PRECISION,
    SOG REAL,
    COG REAL,
    Heading REAL,
    VesselName VARCHAR,
    IMO VARCHAR,
    CallSign VARCHAR,
    VesselType INTEGER,
    Status INTEGER,
    Length REAL,
    Width REAL,
    Draft REAL,
    Cargo VARCHAR,
    TransceiverClass VARCHAR
) with (
    connector = 'redpanda',
    topic = 'ais-data',
    properties.bootstrap.server = 'redpanda:29092',
    scan.startup.mode = 'earliest' -- or 'latest'
) FORMAT PLAIN ENCODE JSON;