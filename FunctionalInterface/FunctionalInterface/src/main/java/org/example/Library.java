package org.example;

class Animal {
    public Animal(){
        System.out.println("In Animal");

    }

    void bark() {
        System.out.println("Animal is barking");
    }
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public Dog(){
        System.out.println("In Dog");

    }
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Poodle extends Dog {
    public Poodle(){
        System.out.println("In Poodle");
    }

//    void bark() {
//        System.out.println("Poodle is barking");
//    }
    void wagTail() {
        System.out.println("Poodle is wagging its tail");
    }
}

class Library{
    public static void main(String[] args){
        Poodle poodle = new Poodle();
        poodle.bark();
        Dog dog = new Poodle();
        dog.bark();
        Animal animal = new Poodle();
        animal.bark();

    }
}