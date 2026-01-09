package com.oops;

 class constructor1 {

}// Q1. What is a constructor in Java?
//A constructor is a special method used to initialize objects.

//Q2. What is the main purpose of a constructor?
//To initialize instance variables of a class.

//Q3. What is the name of a constructor?
//Constructor name must be the same as class name.

//Q4. Does a constructor have a return type?
//No, constructors do not have any return type (not even void).

class Student {

 int id;
 String name;

 // Q5. What is a default constructor?
 // A constructor with no parameters is called default constructor.
 Student() {
     System.out.println("Default constructor called");
 }

 // Q6. What is a parameterized constructor?
 // A constructor that accepts parameters is called parameterized constructor.
 Student(int id, String name) {
     this.id = id;       // Q7. Why is 'this' keyword used?
     this.name = name;   // To refer to current class variables.
 }

 // Q8. Can we create multiple constructors in a class?
 // Yes, this is called constructor overloading.
}

public class constructor {

 public static void main(String[] args) {

     // Q9. When is a constructor called?
     // Automatically when an object is created.

     Student s1 = new Student();              // default constructor
     Student s2 = new Student(101, "Neha");   // parameterized constructor

     System.out.println(s2.id);
     System.out.println(s2.name);

     // Q10. Can we call a constructor explicitly?
     // No, constructors are called automatically.

     // Q11. Can constructors be inherited?
     // No, constructors are not inherited.

     // Q12. Can we make constructor private?
     // Yes, used in Singleton design pattern.
 }
}
