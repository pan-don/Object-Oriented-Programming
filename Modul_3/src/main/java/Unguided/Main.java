/**
 * @author AfanRamadhan
 * NIM: 2311110064
 */

package Unguided;

public class Main {

    public static void main(String args[]) {
        Car car1 = new Car("Supra", "sedan", 2004);
        Car car2 = new Car("Avanza", "minibus", 2001);
        
        car1.showSpecifications();
        car2.showSpecifications();
        
        Engine supraEngine = new Engine("V8", 3000, 450, true);
        Engine avanzaEngine = new Engine("K3-DE", 1300, 150, false);
        
        Transmission supraTransmission = new Transmission("manual");
        Transmission avanzaTransmission = new Transmission("matic");
        
        car1.setupEngine(supraEngine);
        car2.setupEngine(avanzaEngine);
        
        car1.setupTransmission(supraTransmission);
        car2.setupTransmission(avanzaTransmission);
        
        car1.engine.showSpecifications();
        car2.engine.showSpecifications();
        
        System.out.println("============ CASE I ============");
        car1.moving(70);
        car2.moving(35);
        
        System.out.println("\n============ CASE II ============");
        car1.braking(25.0);
        car2.braking(5.0);
    }
}
