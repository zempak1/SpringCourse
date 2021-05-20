package ru.makhmudov.lesson.springlessonapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private String name;
    private int age;
    private String city;
    private Pet pet;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    @Value("${person.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("${person.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    @Value("${person.city}")
    public void setCity(String city) {
        this.city = city;
    }


    public void callYourPet() {
        System.out.println("Come here, my lovely pet!");
        pet.say();
    }
}
