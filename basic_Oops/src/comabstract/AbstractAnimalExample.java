package comabstract;

abstract class Animal {

    void eat() {   // common method
        System.out.println("Animal is eating");
    }

    abstract void sound(); // different for each animal
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AbstractAnimalExample {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.eat();
        a1.sound();

        System.out.println();

        Animal a2 = new Cat();
        a2.eat();
        a2.sound();
    }
}

