# Would You Rather
A Spring Boot application on top of a Postgres database. Create and vote on other would you rather questions.

### Setup:
[Docker](https://www.docker.com/get-started) is used to run a Postgres container for the database or you can install and configure yourself locally.
```
docker-compose up -d
```

### Build:
```
mvn clean package
```

### Run:
```
java -jar target/would-you-rather-{version}.jar
```

The default port the API is running on is 7050 with context path of "/api"


### The application
![home page](https://github.com/deidaraxc4/would-you-rather/blob/master/images/1.png)
![create a question](https://github.com/deidaraxc4/would-you-rather/blob/master/images/2.png)
![vote on questions](https://github.com/deidaraxc4/would-you-rather/blob/master/images/3.png)