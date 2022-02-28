FROM openjdk:17
WORKDIR /usr/src/app/
ARG JAR_FILE=*.jar
COPY ./backend/target/${JAR_FILE} /usr/src/app/application.jar
ENTRYPOINT ["java", "-jar", "/usr/src/app/application.jar"]
EXPOSE 8080
