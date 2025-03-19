package Unguided.entities;

/**
 *
 * @author AfanRamadhan
 */
public class Patient {
    private String name;
    private String gender;
    private String diagnosis;
    
    public void setName(String inputName){
        this.name = inputName;
    }
    
    public void setGender(String inputGender){
        this.gender = inputGender;
    } 
    
    public void setDiagnosis(String inputDiagnosis){
        this.diagnosis = inputDiagnosis;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public String getDiagnosis(){
        return this.diagnosis;
    }
}
