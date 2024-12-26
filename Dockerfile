FROM amazoncorretto:17-alpine
ENV USERNAME=$USERNAME
ENV PASSWORD=$PASSWORD
ENV BRIDGEMQTT_URL=$BRIDGEMQTT_URL
WORKDIR bridge
COPY ./build/libs/roborock-bridge-0.0.9-SNAPSHOT.jar ./roborock-bridge.jar
ENTRYPOINT java -jar roborock-bridge.jar