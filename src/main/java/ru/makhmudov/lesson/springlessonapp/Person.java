package ru.makhmudov.lesson.springlessonapp;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Come here, my lovely pet!");
        pet.say();
    }
}
