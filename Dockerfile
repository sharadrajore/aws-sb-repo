FROM openjdk:8-jdk-alpine
COPY target/sample-sb.jar sample-sb.jar
ENTRYPOINT ["java","-jar","/sample-sb.jar"]