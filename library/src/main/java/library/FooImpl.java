package library;

import io.micronaut.context.annotation.Bean;

@Bean
public class FooImpl implements Foo {
    @Override public String toString () { return "foo"; }
}
