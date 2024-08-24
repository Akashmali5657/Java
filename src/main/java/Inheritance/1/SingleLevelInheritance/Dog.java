package Inheritance.SingleLevelInheritance;

public class Dog extends Inheritance.SingleLevelInheritance.Animal {
    public void bark(){
        System.out.println("Barking");
    }

    public static void main(String[] args) {
        Dog rv= new Dog();
        rv.bark();
        rv.eat();
    }
}
