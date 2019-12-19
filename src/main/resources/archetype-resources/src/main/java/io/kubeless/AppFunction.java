#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package io.kubeless;

public class AppFunction {

    /**
     * Below is an example of Kubeless function
     * <p>
     * All functions must have the following signature
     * ```
     * public String functionName(Event event, Context context)
     * ```
     * <p>
     * This file can contain more than one function. When deploy it to a cluster with Kubeless,
     * you can pick the function using the `--handler` parameter
     * <p>
     * All function logic must be written here. You can use Inner classes to organized your code.
     * <p>
     * In HELP.md, it's explained how to deploy this example Kubeless installed in Minikube
     * <p>
     * For more examples access: https://github.com/ivangfr/kubeless-minikube-environment
     */

    public String greet(Event event, Context context) {
        return "Hello " + getName(event.Data) + "!!!";
    }

    private String getName(String eventData) {
        return eventData.trim().isEmpty() ? "World" : eventData;
    }

}
