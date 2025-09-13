/*
2. Create a class with a method that prints "This is parent class" and its subclass wi
th another method that prints "This is child class". Now, create an object for each of
the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
In the above example, declare the method of the parent class as private and then repea
t the first two
operations (You will get error in the third).
*/


private class parentClass {
    public void parentMethod() {
        System.out.println("This is parent Class");
    }
}

class childClass extends parentClass {
    public void childMethod() {
        System.out.println("This is child Class");
    }
}

public class First_02 {
    public static void main(String[] args) {
        parentClass objParent = new parentClass();
        childClass objChild = new childClass();
        objParent.parentMethod();
        objChild.childMethod();
        objChild.parentMethod();
    }
}
