# syntax=docker/dockerfile:1
FROM gradle:7.3.0-jdk11-alpine AS build
COPY --chown=gradle:gradle . /grao-trial-build
WORKDIR /grao-trial-build
RUN gradle build --no-daemon

FROM openjdk:16-jre-slim

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/grao-trial-1.0-SNAPSHOT-all.jar /app/grao-trial-1.0-SNAPSHOT-all.jar

ENTRYPOINT ["java", "-jar", "/app/grao-trial-1.0-SNAPSHOT-all.jar"]