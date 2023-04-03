package Inheritance;


/*
Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.

 */

public class Inheritance extends Example {

    private String modelName = "Mustang";

    public static void main (String[] args){
        Inheritance inheritance = new Inheritance();
        inheritance.honk();

        //we can create object of parent class and by using this we can call all the method of child class by using extends Keyword

        System.out.println(inheritance.modelName+""+inheritance.brand);
    }

}
