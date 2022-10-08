# mvn clean package spring-boot:repackage
FROM openjdk:11-jre-slim
WORKDIR /usr/src/myapp
COPY target/Spring-boot-api-jwt-activemq-1.0.jar /usr/src/myapp/app.jar
EXPOSE 8080
CMD [ "java", "-jar", "/usr/src/myapp/app.jar" ]