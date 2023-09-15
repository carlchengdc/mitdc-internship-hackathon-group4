FROM artifactory.ap.manulife.com/docker/rsf/rsf-java-newrelic:1.0.2

# Following Environment variable should be set to enable New Relic for the application
#Also following environment variable should be passed by the application team in the values.yaml file for newrelic-agent to work
#ENV NEW_RELIC_APP_NAME=MY-NEW_RELIC_APP_NAME
#ENV NEW_RELIC_LICENSE_KEY=MY-NEW_RELIC_LICENSE_KEY
#ENV NEW_RELIC_DISTRIBUTED_TRACING_ENABLED=true

ARG JAR_FILE

COPY target/${JAR_FILE} app.jar

ENTRYPOINT ["java","-javaagent:./newrelic.jar","-jar","app.jar"]