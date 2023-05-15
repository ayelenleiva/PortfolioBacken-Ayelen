FROM amazoncorretto:8-alpine-jdk
MAINTAINER Ayelen
COPY target/ayelen-0.0.1-SNAPSHOT.jar  deploy-ayelen-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/deploy-ayelen-0.0.1-SNAPSHOT.jar"]