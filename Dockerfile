FROM openjdk:11
EXPOSE 8080
ADD target/employee-demo.jar employee-demo.jar
ENTRYPOINT ["java", "-jar", "employee-demo.jar"]