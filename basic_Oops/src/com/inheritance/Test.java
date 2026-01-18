package com.inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {   // Dog IS-A Animal
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();
    }
}

