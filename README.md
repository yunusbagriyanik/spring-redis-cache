## __Redis Cache__

### Project Requirements

* JDK 17(openjdk-17)
* Maven 3.6.3 or newer
* Spring Boot 3.0.12
* Docker
* MongoDB

### Run Redis

    $ docker-compose up -d
    $ docker exec -it container_id redis-cli
    $ docker exec -it container_id redis-cli FLUSHALL # Clear all keys

![Redis Image](src/main/resources/redis.png)

### Run MongoDB

    $ docker run -d -p 27017:27017 --name test-mongo mongo:4.0.4

![Mongo Image](src/main/resources/mongo.png)

