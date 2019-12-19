#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package io.kubeless;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppFunctionTest {

    @Test
    void testGreetWithName() {
        AppFunction appFunction = new AppFunction();
        assertEquals("Hello Ivan!!!", appFunction.greet(getEvent("Ivan"), getContext()));
    }

    @Test
    void testGreetWithoutName() {
        AppFunction appFunction = new AppFunction();
        assertEquals("Hello World!!!", appFunction.greet(getEvent(), getContext()));
    }

    //-- Helper methods

    public Event getEvent() {
        return getEvent("");
    }

    public Event getEvent(String data) {
        return new Event(data, "", "", "", "");
    }

    public Context getContext() {
        return new Context("", "", "", "");
    }

}