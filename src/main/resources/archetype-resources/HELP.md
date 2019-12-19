# Getting Started

## Running example in Minikube

### Prerequisites

You must have `Kubectl`, `Minikube` and `Kubeless CLI` installed in your machine. Here are the links to websites that explain how install [`Kubectl`](https://kubernetes.io/docs/tasks/tools/install-kubectl/) and [`Minikube`](https://kubernetes.io/docs/tasks/tools/install-minikube/). `Kubeless CLI` can be downloaded from the [release page](https://github.com/kubeless/kubeless/releases).

### Steps to run

1. Start `Minikube` with `Kubeless` installed as explained in [`kubeless-minikube-environment`](https://github.com/ivangfr/kubeless-minikube-environment#start-environment)

1. Compile your project
   ```
   ./mvnw clean compile
   ```
   The plugin [`kubeless-maven-plugin`](https://github.com/ivangfr/kubeless-maven-plugin) is used to generate the output Java class and pom.xml in `target/generated-sources/kubeless` directory.
   
1. Deploy `greeting-java` function
   ```
   kubeless function deploy greeting-java --runtime java1.8 \
   --handler KAppFunction.greet --from-file target/generated-sources/kubeless/KAppFunction.java
   ```
   > **Note:** in case you have added new dependencies to the pom.xml of the project, append the following parameter to the `kubeless function deploy` call
   > ```
   > --dependencies target/generated-sources/kubeless/pom.xml
   > ```

1. Get a description of the function
   ```
   kubeless function describe greeting-java
   ```

1. Check function status
   ```
   kubeless function ls
   ```
   - Continue to the next step when the `STATUS` of the function is `1/1 READY`

   - **Troubleshooting**

     In case the function doesn't get ready, run the following command to get more details
     ```
     kubectl describe pod -n kubeless <greeting-java-running-pod>
     ```

1. Call function
   ```
   kubeless function call greeting-java --data 'Ivan'
   ````

1. Check the function logs
   ```
   kubeless function logs greeting-java
   ```

1. Delete function
   ```
   kubeless function delete greeting-java
   ```
