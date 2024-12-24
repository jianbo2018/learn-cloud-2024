FROM openjdk:21-ea-slim
LABEL authors="jianbo"

EXPOSE 8888

WORKDIR /app

COPY target/hello-world.jar ./

ENTRYPOINT ["java","-jar","/app/hello-world.jar"]