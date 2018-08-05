FROM openjdk:8
ADD target/testimage.jar testimage.jar 
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "testimage.jar"]