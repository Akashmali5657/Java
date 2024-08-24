package Inheritance.HierarchicalInheritance;

public class Cat extends Inheritance.HierarchicalInheritance.Animal {
    public void meow(){
        System.out.println("meowing...");
    }

    public static void main(String[] args) {
        Cat rv = new Cat();
        rv.eat();
        rv.meow();
    }
}
