/**
 * @author AfanRamadhan
 * NIM: 2311110064
 */

package Unguided;

public class Engine {
    String name;
    double displacement;
    int horsepower;
    boolean turbo;
    
    Engine(String inputName, double inputDisplacement, int inputHorsepower, boolean inputTurbo){
        this.name = inputName;
        this.displacement = inputDisplacement;
        this.horsepower = inputHorsepower;
        this.turbo = inputTurbo;
    }
    void showSpecifications(){
        System.out.println("===== ENGINE SPECIFICATIONS =====");
        System.out.println("Engine name : "+this.name);
        System.out.println("Displacement: "+this.displacement);
        System.out.println("Horsepower  : "+this.horsepower);
        System.out.println("Turbo       : "+this.turbo);
        System.out.println();
    }
}
