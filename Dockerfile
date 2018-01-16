FROM openjdk:8-alpine

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/cf-test/cf-test.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
ADD target/lib           /usr/share/cf-test/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/cf-test/cf-test.jar
