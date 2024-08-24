package Inheritance.MultilevelInheritance;

public class BabyDog extends Inheritance.MultilevelInheritance.Dog {
    public void CuteBabyDog(){
        System.out.println("Cut Barking");
    }

    public static void main(String[] args) {
        BabyDog rv=new BabyDog();
        rv.eat();
        rv.bark();
        rv.CuteBabyDog();
    }
}
