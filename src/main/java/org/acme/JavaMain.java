package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class JavaMain {

    public static void main(String[] args) {
        Quarkus.run(Resources.class, args);
    }
}
