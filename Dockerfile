FROM openjdk:17

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} IntegracaoAPI.jar

ENTRYPOINT ["java","-jar","/IntegracaoAPI.jar"]