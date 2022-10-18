import java.io.*;
public class Exception_handling {
    public void display(){
        try {
            int num=100/0;
            System.out.println("Number is "+num);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Exception_handling ob=new Exception_handling();
        ob.display();
    }
}
