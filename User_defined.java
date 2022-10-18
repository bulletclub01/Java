import java.io.*;
class Except extends Exception {
    String s;
    Except(String s1){
        s=s1;
    }
    public String kl(){
        return ("Output String : "+s);
    }


}
public class User_defined {
    public static void main(String[] args) {
        try {
            throw new Except("Custom Message");
        } catch (Except exp) {
            System.out.println(exp);
        }
    }
}