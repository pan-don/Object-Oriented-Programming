/**
 * @author AfanRamadhan
 * NIM: 2311110064
 */

package Unguided;

public class Transmission {
    String type;
    int gear;
    
    Transmission(String inputType) {
        this.type = inputType;
    }
    
    void gearAcummulation(double inputSpeed){
        
        if(inputSpeed <= 0){
            this.gear = 0;
        }else if( inputSpeed  < 20){
            this.gear = 1;
        }else if(inputSpeed <= 45){
            this.gear = 2;
        }else if(inputSpeed <= 70){
            this.gear = 3;
        }else if(inputSpeed <= 100){
            this.gear = 4;
        }else{
            this.gear = 5;
        }
        
    }
}
