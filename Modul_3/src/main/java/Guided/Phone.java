package Guided;

public class Phone {
    String brand;
    int yearRealease;
    
    void call(){
        System.out.println("Calling");
    }
    void sms(){
        System.out.println("Sending SMS");
    }
    void turn_on(){
        System.out.println("Turning on "+this.brand);
    }
    void turn_off(){
        System.out.println("Turning off "+this.brand);
    }
}
