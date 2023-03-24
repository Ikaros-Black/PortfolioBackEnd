FROM amazoncorretto:11-alpine-jdk
MAINTAINER BENITEZ
COPY target/Benitez-0.0.1-SNAPSHOT.jar  benitez-app.jar
ENTRYPOINT ["java","-jar","/benitez-app.jar"]
