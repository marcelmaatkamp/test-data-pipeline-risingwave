# AIS in Risingwave (wip)

# startup

```bash
docker compose \
  up -d \
    console \
    importer
```

# import 
```bash
docker compose \
  up -d \
    risingwave-standalone \
    risingwave-dbt
```

```bash
docker compose run postgres-0 bash -c 'psql -h risingwave-standalone -p 4566 -d dev -U root -c "select * from ais_source"'
```

`

