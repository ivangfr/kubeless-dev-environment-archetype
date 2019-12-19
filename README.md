# kubeless-dev-environment-archetype

## Install archetype locally

```
git clone https://github.com/ivangfr/kubeless-dev-environment-archetype.git
cd kubeless-dev-environment-archetype
./mvnw clean install
```

## Generate application from archetype

There are two ways

- Interactive mode
  ```
  ./mvnw archetype:generate -DarchetypeCalalog=local
  ```

- Non-Interactive mode
  ```
  ./mvnw archetype:generate \
      -B -DarchetypeGroupId=org.ivanfranchin \
      -DarchetypeArtifactId=kubeless-dev-environment-archetype \
      -DarchetypeVersion=1.0-SNAPSHOT \
      -DgroupId=com.mycompany \
      -DartifactId=myapp \
      -Dversion=1.0-SNAPSHOT \
      -Dpackage=com.mycompany.myapp
  ```
