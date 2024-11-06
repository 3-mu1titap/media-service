
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/media-0.0.1-SNAPSHOT.jar media-service.jar

EXPOSE 9400

ENTRYPOINT ["java", "-jar", "media-service.jar"]

ENV TZ=Asia/Seoul