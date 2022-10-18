import java.io.*;
abstract class Abstract_class {
    abstract void python();
}
class Coding extends Abstract_class {
    void python() {
        System.out.println("Program is well executed in python....");
    }

public static void main(String[] args) {
    Abstract_class ob=new Coding();
    ob.python();
        }
}