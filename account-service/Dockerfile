FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>
ARG JAVA_OPTS="-Xmx200m"
ARG DEBUG_PORT

ENTRYPOINT java $JAVA_OPTS -jar /app/account-service.jar

COPY ./target/account-service.jar /app/account-service.jar

EXPOSE 6000
EXPOSE $DEBUG_PORT