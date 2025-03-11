/**
 * @author AfanRamadhan
 * NIM: 2311110064
 */

package Unguided;

public class Car {
    String name;
    String type;
    int yearProduction;
    double speed;
    Engine engine;
    Transmission transmission;
    
    Car(String inputName, String inputType, int inputYearProduction){
        this.name = inputName;
        this.type = inputType;
        this.yearProduction = inputYearProduction;
    }
    
    void setupEngine(Engine inputEngine){
        this.engine = inputEngine;
    }
    
    void setupTransmission(Transmission inputTransmission){
        this.transmission = inputTransmission;
    }
    
    void moving(double inputSpeed){
        this.speed = speed + inputSpeed;
        if(transmission.type == "manual"){
            transmission.gearAcummulation(this.speed);
        }
        showSpeed();
    }
    
    void braking(double inputBraking){
        this.speed = this.speed - inputBraking;
        if(transmission.type == "manual"){
            transmission.gearAcummulation(this.speed);
        }
        showSpeed();
    }
    
    void showSpeed(){
        if(transmission.type == "manual"){
            System.out.println(this.name+" car is traveling at a speed of "+this.speed+" km/h in gear "+transmission.gear);
        }else{
            System.out.println(this.name+" car is traveling at a speed of "+this.speed+" km/h");
        }
    }
        
    void showSpecifications(){
        System.out.println("====== CAR SPECIFICATIONS ======");
        System.out.println("Car name    : "+this.name);
        System.out.println("Car type    : "+this.type);
        System.out.println("Year of production: "+this.yearProduction);
        System.out.println();
    }
}
