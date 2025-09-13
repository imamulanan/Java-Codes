/*
 * Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call

 1 - method of parent class by object of parent class
 2 - method of child class by object of child class
 3 - method of parent class by object of child class

 */

class parentClass {
    public void parentMethod() {
        System.out.println("This is parent Class");
    }
}

class childClass extends parentClass {
    public void childMethod() {
        System.out.println("This is child Class");
    }
}

public class First {
    public static void main(String[] args) {
        parentClass objParent = new parentClass();
        childClass objChild = new childClass();
        objParent.parentMethod();
        objChild.childMethod();
        objChild.parentMethod();
    }
}
