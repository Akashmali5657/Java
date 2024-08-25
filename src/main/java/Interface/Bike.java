package Interface;
/* 1. we can't define private and protected modified for variables. Only abstract and public modifiers are
allowed for methods in interfaces.
2.we can't create object of interface and static blocks.
3. we can create static and default methods.
4  interface methods can't be final.
5. can't create constructor
6. Yes, we can define variable in an interface that must be implicitly static and final.
7.An Interface that doesn’t have any data members or methods is called marker interface in java.
For example, Serializable, Cloneable, Remote, etc.
8.An interface that has exactly one abstract method is called functional interface in java.
It is also known as single abstract method interface. and not mandatory use of @FunctionalInterface annotation
with Functional interface */
public interface Bike {
    void run();
}
