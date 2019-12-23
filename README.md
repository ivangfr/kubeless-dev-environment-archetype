# kubeless-dev-environment-archetype

This is a [`Maven Archetype`](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) used for development of [`Kubeless`](https://kubeless.io/) Functions

## Prerequisites

- You must have a recent version of [`Apache Maven`](https://maven.apache.org/) and [`JDK 1.8`](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or later installed in your machine.

## Clone repos

1. Clone `kubeless-maven-plugin` project
   ```
   git clone https://github.com/ivangfr/kubeless-maven-plugin.git
   ```

1. At the same level as `kubeless-dev-environment`, clone `kubeless-dev-environment-archetype`
   ```
   git clone https://github.com/ivangfr/kubeless-dev-environment-archetype.git
   ```

1. This should be the final directory structure
   ```
   .
   ├── kubeless-dev-environment-archetype
   ├── kubeless-maven-plugin
   ```

## Install kubeless-maven-plugin

Nagigate to `kubeless-maven-plugin` directory and run the command below to install the plugin locally
```
mvn clean install
```

## Install archetype locally

Navigate to `kubeless-dev-environment-archetype` and run the following command to install archetype locally
```
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

The structure of a project with groupId `com.mycompany`, package `com.mycompany.myapp` and artifactId `myapp`, should look like:
```
myapp
├── .mvn
│   └── wrapper
│       ├── MavenWrapperDownloader.java
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    ├── main
    │   └── java
    │       ├── com
    │       │   └── mycompany
    │       │       └── myapp
    │       │           └── App.java
    │       └── io
    │           └── kubeless
    │               └── AppFunction.java
    └── test
        └── java
            ├── com
            │   └── mycompany
            │       └── myapp
            │           └── AppTest.java
            └── io
                └── kubeless
                    └── AppFunctionTest.java
```

## Maven Wrapper

The `Maven Wrapper` files, `mvnw` (Linux and Mac) and `mvnw.cmd` (Windows), are inside the generated application directory.

For Linux and Mac users, in order to make `mvnw` executable run
```
chmod +x mvnw
```
