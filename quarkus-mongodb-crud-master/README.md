# quarkus-mongodb-crud
This project is based on Quarkus framework which builds subatomic container runtime platform.  

Maven commands:

mvn compile quarkus:dev

mvn package

mvn test

You can create a native executable using: "mvn package -Pnative"

Or you can use Docker to build the native executable using: "mvn package -Pnative -Dquarkus.native.container-build=true"

To create a docker image: "docker build -f src/main/docker/Dockerfile.native -t quarkus/quarkus-project ."

To run the continer: "docker run -i --rm -p 8080:8080 quarkus/quarkus-project"
