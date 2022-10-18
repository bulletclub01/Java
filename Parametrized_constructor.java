import java.io.*;

class Texter{
    String name;
    Texter(String name){
        this.name=name;
    }
}
public class Parametrized_constructor {
    public static void main(String[] args) {
        Texter tx=new Texter("Let Me In");
        System.out.println(tx.name);


    }
}
