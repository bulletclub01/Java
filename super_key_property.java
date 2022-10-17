import java.io.*;
import java.util.*;

class Car{
    int bike_speed=225;
}
class Bike extends Car{
    int bike_speed=500;
    void pro(){
        System.out.println("Speed of vehicle = "+ bike_speed);
        System.out.println(super.bike_speed);
    }
}
public class super_key_property {
    public static void main(String[] args) {
        Bike jl=new Bike();
        jl.pro();
        
    }
}
