package application;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import library.Bar;
import library.Foo;

@Controller("/bar")
public class BarController {
    @Inject Bar bar;

    @Get
    public String get () {
        return bar.toString();
    }
}
