FROM openjdk:17
ADD target/spring-security-rbac.jar spring-security-rbac.jar
EXPOSE 9095
ENTRYPOINT ["java","-jar","spring-security-rbac.jar"]




