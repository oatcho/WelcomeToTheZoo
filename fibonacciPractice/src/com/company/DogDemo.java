package com.company;

public class DogDemo {

    public static void main(String[] args) {

        Dog firstDog = new Dog();

        firstDog.setName("Charlie");
        firstDog.setBreed("Lab");
        firstDog.setAge(4);

        System.out.println("This dog's name is " + firstDog.getName());
        System.out.println("This dog is a " + firstDog.getBreed());
        System.out.println("He is " + firstDog.getAge() + "years old.");




    }
}
