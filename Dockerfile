FROM openjdk:8
EXPOSE 8000
ADD target/Banking_Application.jar Banking_Application.jar
ENTRYPOINT ["java","-jar","/Banking_Application.jar"]