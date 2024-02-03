FROM amazoncorretto:17-alpine-jdk
COPY target/internationalisation-demo-0.0.1-SNAPSHOT.jar .
WORKDIR .
ENTRYPOINT ["java", "-jar", "internationalisation-demo-0.0.1-SNAPSHOT.jar"]