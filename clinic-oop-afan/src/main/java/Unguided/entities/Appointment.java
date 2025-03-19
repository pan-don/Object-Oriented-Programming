package Unguided.entities;

import java.time.LocalDateTime;

/**
 *
 * @author AfanRamadhan
 */
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime appointmentDate;
    
    public void setDoctor(Doctor inputDoctor){
        this.doctor = inputDoctor;
    }
    
    public void setPatient(Patient inputPatient){
        this.patient = inputPatient;
    }
    
    public void setAppointmentDate(LocalDateTime inputAppointmentDate){
        this.appointmentDate = inputAppointmentDate;
    }
    
    public Doctor getDoctor(){
        return this.doctor;
    }
    
    public Patient getPatient(){
        return this.patient;
    }
    
    public LocalDateTime getAppointmentDate(){
        return this.appointmentDate;
    }
}
