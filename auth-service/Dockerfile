FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ARG JAVA_OPTS="-Xmx200m"
ARG DEBUG_PORT

ENTRYPOINT java $JAVA_OPTS -jar /app/auth-service.jar

COPY ./target/auth-service.jar /app/auth-service.jar

EXPOSE 5000
EXPOSE $DEBUG_PORT