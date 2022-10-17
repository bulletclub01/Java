import java.io.*;
import java.util.*;
class Text{
    void text(){
        System.out.println("Let Me In");
    }
}
class New extends Text{
    void text(){
        System.out.println("Yowie Wowie");
    }
    void over(){
        super.text();
        text();
    }
}
public class super_key_methods {
    public static void main(String[] args) {
        New obj=new New();
        obj.over();

    }
}
