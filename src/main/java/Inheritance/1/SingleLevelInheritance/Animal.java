package Inheritance.SingleLevelInheritance;

/*
1.Is-A relationship represents Inheritance. It is implemented using the “extends” keyword. It is used for code reusability.
2.Static block cannot be inherited to its subclass.
3.a class or method declared with final, private keyword cannot be inherited.
 */
public class Animal {
    public void eat(){
        System.out.println("Eating");
    }
}
