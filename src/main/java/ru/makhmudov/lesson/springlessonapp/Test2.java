package ru.makhmudov.lesson.springlessonapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.makhmudov.lesson.springlessonapp.configurations.appConfig;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(appConfig.class);

        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();
    }
}
