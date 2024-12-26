FROM openjdk:21-ea-slim
LABEL authors="jianbo"

EXPOSE 8889

WORKDIR /app

COPY target/lb-search-engine.jar ./

ENTRYPOINT ["java","-jar","/app/lb-search-engine.jar","-Dspring.profiles.active=qa"]