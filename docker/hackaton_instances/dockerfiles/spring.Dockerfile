FROM openjdk:17
WORKDIR /usr/src/app/
ARG JAR_FILE=*.jar
COPY ./backend/target/${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]
EXPOSE 8080
