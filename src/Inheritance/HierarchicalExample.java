package Inheritance;
//When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

public class HierarchicalExample {
        void eat(){System.out.println("eating...");}
    }
    class Dogss extends HierarchicalExample{
        void bark(){System.out.println("barking...");}
    }
    class Cat extends HierarchicalExample{
        void meow(){System.out.println("meowing...");}
    }
    class TestInheritance3{
        public static void main(String args[]){
            Cat c=new Cat();
            c.meow();
            c.eat();
//c.bark();//C.T.Error
        }}

