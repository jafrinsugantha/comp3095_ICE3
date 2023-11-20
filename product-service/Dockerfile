#Dockerfile for product-service

#BUILD STAGE
#base image
FROM gradle:8-jdk17-alpine AS builder
#copy the application files from the host machine to the image filesystem
COPY --chown=gradle:gradle . /home/gradle/src
#set the directory within the image, for executing future commands
WORKDIR /home/gradle/src
#run gradle build within the container - NOT the host machine
RUN gradle build -x test

#---------------------------
#Package stage
#---------------------------
#base image
FROM openjdk:17-alpine
RUN mkdir /app
COPY --from=builder /home/gradle/src/build/libs/*.jar /app/product-service.jar
ENV MONGO_DB_USERNAME=rootadmin MONGO_DB_PWD=password
EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app/product-service.jar"]