package impl;

import arch.Language;

/**
 * Created by prituladima on 1/22/18.
 */
public class English implements Language {

    public String getGreeting() {
        return "Hello";
    }

    public String getBye() {
        return "Bye bye";
    }
}
