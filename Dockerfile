FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD mysell-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","/app.jar"," > /usr/wsb/dockerImages/app.log"]
