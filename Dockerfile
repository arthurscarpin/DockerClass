FROM eclipse-temurin:17
LABEL maintainer="scarpinarthur.dev@gmail.com"
WORKDIR /app
COPY target/DockerClass-0.0.1-SNAPSHOT.jar /app/docker-class.jar
ENTRYPOINT ["java", "-jar", "docker-class.jar"]