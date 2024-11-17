FROM eclipse-temurin:17
COPY target/pratice.jar practice.jar
CMD ["java","-jar","practice.jar"]