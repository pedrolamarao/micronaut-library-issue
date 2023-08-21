package library;

import impl.BarImpl;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.env.Environment;
import jakarta.inject.Inject;

@Factory
public class BarFactory {
    @Bean public Bar bar () {
        return new BarImpl();
    }
}
