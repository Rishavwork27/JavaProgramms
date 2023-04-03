package Abstraction;
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
/*
A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 */




//Example of Abstract class that has an abstract method
 abstract class Abstraction {
     abstract void run();     //abstract method don't have body
}

class Bike extends Abstraction{
      void run(){
          System.out.println("FAsT");
      }

      public static void main(String[] args){
          Bike bike =new Bike();   //we can't initialised object od abstract class
          bike.run();
      }
}

//Example of Abstact class

abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest() {
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class TestBank{
    public static void main(String args[]){
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }}


//Example of an abstract class that has abstract and non-abstract methods
abstract class Bikes{
     Bikes(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bikes{
    void run(){
        System.out.println("running safely..");
    }
}
//Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2{
    public static void main(String args[]){
        Bikes obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
//Abstract class having constructor, data member and methods

