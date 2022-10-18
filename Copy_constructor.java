import java.io.*;
class Info{
    int person_id;
    String person_name;
    Info(int i,String n){
        person_id=i;
        person_name=n;
    }
    Info(Info o){
        person_id=o.person_id;
        person_name=o.person_name;
    }
    void get(){
        System.out.println("Your user name is "+ person_name);
        System.out.println("Your user id is "+person_id);
    }
}
public class Copy_constructor {
    public static void main(String[] args) {
        Info jk=new Info(22,"Karrion");
        Info kk=new Info(jk);
        jk.get();
        kk.get();

    }
}
