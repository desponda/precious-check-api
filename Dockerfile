FROM openjdk:latest

COPY target/*.jar /opt/app/app.jar

ENTRYPOINT java --add-modules java.xml.bind -jar /opt/app/app.jar