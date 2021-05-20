package ru.makhmudov.lesson.springlessonapp;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Wow-Wow");
    }
}
