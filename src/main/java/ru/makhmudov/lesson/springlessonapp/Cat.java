package ru.makhmudov.lesson.springlessonapp;

public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
