# AIS in Risingwave (wip)

importer -> rw -> pocketbase -> electric -> frontend

docker exec -ti postgres psql -h risingwave -p 4566 -d dev -U root

docker exec -ti postgres psql -h localhost -p 5678 -d metadata -U postgres

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
docker compose run postgres bash -c 'psql -h risingwave -p 4566 -d dev -U root -c "select * from ais_source"'
```

`

