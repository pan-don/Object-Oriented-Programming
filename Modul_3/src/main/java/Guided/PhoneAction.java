package Guided;

public class PhoneAction {

    public static void main(String args[]) {
        Phone phone1 = new Phone();
        phone1.brand = "Samsung";
        phone1.yearRealease = 2020;
        
        Phone phone2 = new Phone();
        phone2.brand = "Apple";
        phone2.yearRealease = 2021;
        
        System.out.println("Phone 2 brand: "+phone2.brand);
        System.out.println("Phone 2 year : "+phone2.yearRealease);
        System.out.println("Phone 1 brand: "+phone1.brand);
        System.out.println("Phone 1 year : "+phone1.yearRealease);
        
        phone1.turn_on();
        phone1.call();
        phone1.sms();
        phone1.turn_off();
    }
}
