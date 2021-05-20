package ru.makhmudov.lesson.springlessonapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.makhmudov.lesson.springlessonapp.configurations.appConfig;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(appConfig.class);

        Person person = context.getBean("personBean", Person.class);

        System.out.printf("Hey! My name is %s, I am %d old and I live in %s. My favourite pet is Cat!\n",
                person.getName(), person.getAge(), person.getCity());

        person.callYourPet();

        context.close();
    }
}
