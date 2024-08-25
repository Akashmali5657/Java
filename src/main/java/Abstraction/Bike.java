package Abstraction;

/*
1. we can't create object of Abstract class
2. A method which is declared with abstract modifier and
has no implementation (means no body) is called abstract method in java. method end with semicolon.
3. we can't declare abstract method as static and private.
4.A concrete method in Java is a method which has always the body. It is also called a complete method in java.
5. we can create constructor of abstract class.
6.we can create private, final, static, and concrete methods in abstract class.
7.Why abstract class has constructor even though you cannot create object?
Ans: We cannot create an object of abstract class but we can create an object of subclass of abstract class. When we create an object of subclass of an abstract class, it calls the constructor of subclass.
This subclass constructor has a super keyword in the first line that calls constructor of an abstract class. Thus, the constructors of an abstract class are used from constructor of its subclass.
If the abstract class doesn’t have constructor, a class that extends that abstract class will not get compiled.

When/where - An abstract class can be used when we need to share the same method to all non-abstract subclasses with their
own specific implementations.
 */
public abstract class Bike {
    abstract void run();
}
