FROM adoptopenjdk:11-jre-hotspot as builder
ADD build/libs/api-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
WORKDIR /service
COPY ./build/libs/*.jar ./api-kotlin.jar
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=50", "-Djava.security.egd=file:/dev/./urandom", "-Dfile.encoding=UTF8", "-Duser.timezone=America/Sao_Paulo", "-jar", "/service/api-kotlin.jar"]