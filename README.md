# kubeless-dev-environment-archetype

This is a [`Maven Archetype`](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) used for development of [`Kubeless`](https://kubeless.io/) functions

## Prerequisites

- You must have a recent version of [`Apache Maven`](https://maven.apache.org/) installed in your machine.

## Install archetype locally

```
git clone https://github.com/ivangfr/kubeless-dev-environment-archetype.git
cd kubeless-dev-environment-archetype
mvn clean install
```

## Generate application from archetype

There are two ways:

- Interactive mode
  ```
  mvn archetype:generate -DarchetypeCalalog=local
  ```

- Non-Interactive mode
  ```
  mvn archetype:generate \
      -B \
      -DarchetypeGroupId=org.ivanfranchin \
      -DarchetypeArtifactId=kubeless-dev-environment-archetype \
      -DarchetypeVersion=1.0-SNAPSHOT \
      -DgroupId=com.mycompany \
      -DartifactId=myapp \
      -Dversion=1.0-SNAPSHOT \
      -Dpackage=com.mycompany.myapp
  ```

## Maven Wrapper

The `Maven Wrapper` files, `mvnw` (Linux and Mac) and `mvnw.cmd` (Windows), are inside the generated application directory.

For Linux and Mac users, in order to make `mvnw` executable run
```
chmod +x mvnw
```
