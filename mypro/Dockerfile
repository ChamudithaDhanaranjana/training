# Use a base image with Java 17 or later (you can choose a different version if needed)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file to the container
COPY target/mypro-0.0.1-SNAPSHOT.jar /app/mypro-0.0.1-SNAPSHOT.jar

# Command to run the Java application
CMD ["java", "-jar", "mypro-0.0.1-SNAPSHOT.jar"]
