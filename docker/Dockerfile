#FROM docker.smallrookie.top/openjdk:8u102-jdk 
FROM jenkins/jenkins:jdk17 
WORKDIR /usr/local/
COPY JenkinsApp3.jar app.jar
EXPOSE 8085
#CMD java -jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
