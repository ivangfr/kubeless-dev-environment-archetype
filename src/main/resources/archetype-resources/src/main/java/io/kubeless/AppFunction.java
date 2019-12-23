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
     * public String functionName(io.kubeless.Event event, io.kubeless.Context context)
     * ```
     * <p>
     * This file can contain more than one function. When it's deployed to a Kubeless cluster,
     * you can pick the function using the `--handler` parameter
     * <p>
     * All function logic must be written here in this file. You can use Inner classes to organized your code.
     * <p>
     * In HELP.md, it's explained how to deploy this example Kubeless installed in Minikube
     * <p>
     * For more examples access: https://github.com/ivangfr/kubeless-minikube-environment
     */

    public String greet(Event event, Context context) {
        String name = event.Data.trim().isEmpty() ? "World" : event.Data;
        return "Hello " + name + "!!!";
    }

}
