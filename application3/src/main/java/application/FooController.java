package application;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import library.Foo;

@Controller("/foo")
public class FooController {
    @Inject Foo foo;

    @Get
    public String get () {
        return foo.toString();
    }
}
