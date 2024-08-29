package Encapsulation;

/*
1. Declare the variable of the class as private.Provide public setter and getter methods to modify the values of variables.
2. Encapsulation means combining the data of our application and its manipulation in one place. It allows the state of
an object to be accessed and modified through behavior. It reduces the coupling of modules and increases the cohesion
inside them.
3.here we bind variable and method into object
 */
public class Student {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
