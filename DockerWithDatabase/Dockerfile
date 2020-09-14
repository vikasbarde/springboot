FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/DockerWithDatabase-0.0.1-SNAPSHOT.jar DockerWithDatabase-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DockerWithDatabase-0.0.1-SNAPSHOT.jar"]