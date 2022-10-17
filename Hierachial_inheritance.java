import java.io.*;
import java.util.*;

class Numbers{
    int num1,num2;
    public void calc(){
        System.out.println("Here we go...");
    }
}
class Multiplly extends Numbers{
    public void mul(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Multiplication of " + num1 +" and "+num2+" is "+(num1*num2));
    }
}
class Add extends Numbers{
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition of " + num1 +" and "+num2+" is "+(num1+num2));
    }
}
public class Hierachial_inheritance {
    public static void main(String[] args) {
        Add ob =new Add();
        Multiplly obj=new Multiplly();
        ob.calc();
        ob.add();
        obj.calc();
        obj.mul();

    }
}
