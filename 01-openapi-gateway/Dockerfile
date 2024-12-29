FROM openjdk:21-ea-slim
LABEL authors="jianbo"

EXPOSE 10000

WORKDIR /app

COPY target/lb-openapi.jar ./

ENTRYPOINT ["java","-Dspring.profiles.active=qa","-jar","/app/lb-openapi.jar"]