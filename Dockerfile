FROM --platform=linux/amd64 openjdk:17-jdk-alpine
COPY build/libs/cloud-native-infra-demo-1.0.0.jar cloud-native-infra-demo-1.0.0.jar
ENTRYPOINT ["java","-jar","/cloud-native-infra-demo-1.0.0.jar"]
