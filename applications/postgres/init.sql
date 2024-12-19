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
