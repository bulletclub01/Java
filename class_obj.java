import java.io.*;
import java.util.*;
import java.lang.Math;

class class_obj {
    float rad,per,area;
    public void calc(){
        Scanner sc =new Scanner(System.in);
        System.out.println();
        rad=sc.nextFloat();
        area= (float) (rad*rad*Math.PI);
        per= (float) (2*rad*Math.PI);
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+per);
    }

    public static void main(String[] args) {
        class_obj ob = new class_obj();
        ob.calc();
    }

}
