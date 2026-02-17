FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

ARG BUILD_NUMBER
ENV APP_BUILD_NUMBER=${BUILD_NUMBER}

COPY target/demo-1.0.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/app/app.jar"]

