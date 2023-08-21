package application;

import io.micronaut.context.annotation.Import;
import io.micronaut.runtime.Micronaut;

public class Launcher {
    public static void main (String[] args) {
        Micronaut.run(Launcher.class,args);
    }
}
