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

```bashdocker compose run postgres-0 bash -c 'psql -h risingwave-standalone -p 4566 -d dev -U root'

```

# show


2023-06-13T10:00:00Z
2024-01-01T00:00:04Z

# metabase
```bash
docker compose exec postgres-0 bash -c 'createdb -U postgres metabase'
```

