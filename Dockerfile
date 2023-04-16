
# Build stage
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/devops/src
COPY pom.xml /home/devops
RUN mvn -f /home/devops/pom.xml clean package

# Package stage
FROM eclipse-temurin:11.0.12_7-jdk
COPY --from=build /home/devops/target/socialmediastatus-api.jar /usr/local/lib/socialmediastatus-api.jar
EXPOSE 5002
ENTRYPOINT ["java","-jar","/usr/local/lib/socialmediastatus-api.jar"]