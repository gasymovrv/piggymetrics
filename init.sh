#!/bin/bash

cd account-service
docker build -t account-service .

cd ../auth-service
docker build -t auth-service .

cd ../config
docker build -t config .

cd ../gateway
docker build -t gateway .

cd ../mongodb
docker build -t mongodb .

cd ../monitoring
docker build -t monitoring .

cd ../notification-service
docker build -t notification-service .

cd ../registry
docker build -t registry .

cd ../statistics-service
docker build -t statistics-service  .

cd ../turbine-stream-service
docker build -t turbine-stream-service  .

