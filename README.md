# AIS in Risingwave (wip)

# startup

```bash
docker compose up -d console
```

# import

```bash
docker compose up importer
```

# show

```bash
docker compose run postgres-0 bash -c 'psql -h risingwave-standalone -p 4566 -d dev -U root'
```