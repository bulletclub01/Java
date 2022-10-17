import java.io.*;
import java.util.*;

class Addition{
    int num1,num2;
    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition of " + num1 +" and "+num2+" is "+(num1+num2));
    }
}
class Multiplication extends Addition{
    public void mul(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Multiplication of " + num1 +" and "+num2+" is "+(num1*num2));
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        Multiplication mu=new Multiplication();
        mu.calc();
        mu.mul();

    }

}
