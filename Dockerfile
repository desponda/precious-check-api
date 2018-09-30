FROM openjdk:latest

COPY target/*.jar /opt/app/app.jar

ENTRYPOINT java -jar /opt/app/app.jar