CREATE EXTENSION postgres_fdw;

CREATE SERVER risingwave
        FOREIGN DATA WRAPPER postgres_fdw
        OPTIONS (
            host 'risingwave',
            port '4566', 
            dbname 'dev');

CREATE USER MAPPING FOR postgres
        SERVER risingwave
        OPTIONS (
            user 'root', 
            password 'root');

IMPORT FOREIGN SCHEMA public
    FROM SERVER risingwave 
        INTO public;

CREATE TABLE ais_position (
    mmsi INTEGER PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    DateTime TIMESTAMP WITH TIME ZONE,
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
);