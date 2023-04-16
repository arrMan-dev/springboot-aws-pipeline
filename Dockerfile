FROM amazoncorretto:17
EXPOSE 8080
ADD target/aws-pipeline.jar aws-pipeline.jar
ENTRYPOINT ["java", "-jar", "/aws-pipeline.jar"]
