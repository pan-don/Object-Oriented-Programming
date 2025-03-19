package Unguided.entities;

/**
 *
 * @author AfanRamadhan
 */
public class Doctor {
    private String id;
    private String name;
    private String specialist;
    
    public void setId(String inputId){
        this.id = inputId;
    }
    
    public void setName(String inputName){
        this.name = inputName;
    }
    
    public void setSpecialist(String inputSpecialist){
        this.specialist = inputSpecialist;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSpecialist(){
        return this.specialist;
    }
}



