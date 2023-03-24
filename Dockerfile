FROM amazoncorretto:11-alpine-jdk
MAINTAINER Benitez
COPY target/Benitez-0.0.1-SNAPSHOT.jar  Benitez-app.jar
ENTRYPOINT ["java","-jar","/benitez-app.jar"]
