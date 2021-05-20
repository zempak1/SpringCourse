package ru.makhmudov.lesson.springlessonapp.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.makhmudov.lesson.springlessonapp")
@PropertySource("application.properties")
public class appConfig {
}
