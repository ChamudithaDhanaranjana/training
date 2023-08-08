# Use a base image with Java 17 or later (you can choose a different version if needed)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file to the container
COPY target/demo2-1.0-SNAPSHOT.jar /app/demo2-1.0-SNAPSHOT.jar

# Command to run the Java application
CMD ["java", "-jar", "demo2-1.0-SNAPSHOT.jar"]
