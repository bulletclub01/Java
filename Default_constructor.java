import java.io.*;

class Defaults{
    int num;
    String name;
    Defaults(){
        System.out.println("This is default..");
    }
}
public class Default_constructor {
    public static void main(String[] args) {
        Defaults ob=new Defaults();
        System.out.println(ob.num);
        System.out.println(ob.name);

    }
}
