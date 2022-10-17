import java.io.*;
import java.util.*;

class Additions{
    int num1,num2;
    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition of " + num1 +" and "+num2+" is "+(num1+num2));
    }
}
class Multiplications extends Additions{
    public void mul(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Multiplication of " + num1 +" and "+num2+" is "+(num1*num2));
    }
}
class Over extends Multiplications{
    public void ov(){
        System.out.println("Calculations are over....");
    }
}
class javaa extends Over{
    public void ja(){
        System.out.println("Check this out!!");
    }
}
public class Multiple_inheritance {
    public static void main(String[] args) {
        javaa kl=new javaa();
        kl.ja();
        kl.mul();
        kl.calc();
        kl.ov();
    }
}
