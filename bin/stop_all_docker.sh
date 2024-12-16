#!/bin/bash

# Get all docker-compose files in the root directory
COMPOSE_FILES=$(find . -maxdepth 1 -name "docker-compose*.yml" -print)

# If no docker-compose files are found, exit
if [ -z "$COMPOSE_FILES" ]; then
  echo "No docker-compose files found in the root directory."
  exit 1
fi

# Loop through each docker-compose file and run docker compose down
while IFS= read -r file; do
  echo "Stopping containers defined in: $file"
  docker compose -f "$file" down
done <<< "$COMPOSE_FILES"

echo "All docker containers stopped."

for volume in $(docker volume ls | awk '{ print $2 }' | grep -v VOLUME)
do
  docker volume rm ${volume}
done