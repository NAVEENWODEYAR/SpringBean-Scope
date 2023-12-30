# Dockerfile- blueprint to build docker image,
FROM openjdk:21
RUN mkdir /usr/app/
COPY /target/Phaseolus_Vulgaris.Jar /usr/app
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","Phaseolus_Vulgaris.jar"]