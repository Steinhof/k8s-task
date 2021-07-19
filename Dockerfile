FROM openjdk:16-jdk-alpine
LABEL maintainer=steinhof
WORKDIR /app
COPY libs libs/
COPY resources resources/
COPY classes classes/
ENTRYPOINT ["java", "-cp", "/app/resources:/app/classes:/app/libs/*", "com.otus.k8stask.K8sTaskApplication"]
EXPOSE 8000