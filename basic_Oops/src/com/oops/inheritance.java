package com.oops;
class inheritance1 {

}// Q1. What is Inheritance in Java?
//Inheritance is a mechanism where one class acquires the properties and behavior
//of another class using the 'extends' keyword.

//Q2. Which class is called Parent/Super class?
//The class whose properties are inherited is called Parent or Super class.

//Q3. Which class is called Child/Sub class?
//The class that inherits another class is called Child or Sub class.

class Animal {

 // Q4. Why are variables declared protected in inheritance?
 // protected members are accessible in child classes.
 protected String type = "Animal";

 // Q5. What method is inherited by child class?
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Q6. Which keyword is used to achieve inheritance?
//Answer: extends
class Dog extends Animal {

 // Q7. What is method overriding?
 // When child class provides its own implementation of parent class method.
 @Override
 void sound() {
     System.out.println("Dog barks");
 }

 // Q8. What is the use of super keyword?
 void showType() {
     System.out.println("Type: " + super.type);
 }
}

//Q9. What type of inheritance is this?
//Answer: Single Inheritance

public class inheritance {

 public static void main(String[] args) {

     // Q10. Can we access parent class methods using child object?
     // Yes, using child class object.

     Dog d = new Dog();
     d.sound();      // overridden method
     d.showType();

     // Q11. Can we create object of parent class?
     // Yes.
     Animal a = new Animal();
     a.sound();

     // Q12. Does Java support multiple inheritance using classes?
     // No, Java does not support multiple inheritance using classes.
 }
}
