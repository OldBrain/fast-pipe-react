package ru.react.fastpipe.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.reactive.config.PathMatchConfigurer;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
//@EnableWebFlux
@AllArgsConstructor
public class WebConfig implements WebFluxConfigurer {
    @Override
    public void configurePathMatching(PathMatchConfigurer configurer) {
        configurer
                .setUseCaseSensitiveMatch(true)
                .addPathPrefix("/api", HandlerTypePredicate.forAnnotation(RestController.class))
                .addPathPrefix("/", HandlerTypePredicate.forAnyHandlerType());
    }
}
