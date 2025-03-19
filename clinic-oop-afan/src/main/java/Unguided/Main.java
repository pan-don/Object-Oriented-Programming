package Unguided.entities;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author AfanRamadhan
 */


public class Main {
    private static List<Appointment> appointments = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    
    private static boolean isConflict(LocalDateTime datetime){
        for(Appointment data: appointments){
            if(data.getAppointmentDate().equals(datetime)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        Doctor doctor1 = new Doctor();
        
        doctor1.setId("2115");
        doctor1.setName("Budi");
        doctor1.setSpecialist("Kardiologi");
        
        System.out.println("Masukan nama pasien     : ");
        String patientName = scanner.nextLine();
        System.out.println("Masukan gender pasien   : ");
        String patientGender = scanner.nextLine();
        System.out.println("Masukan diagnosis pasien: ");
        String patientDiagnosis = scanner.nextLine();
        
        Patient patient1 = new Patient();
        patient1.setName(patientName);
        patient1.setGender(patientGender);
        patient1.setDiagnosis(patientDiagnosis);
        
        System.out.println("Masukan tanggal janji temu: ");
        String date = scanner.nextLine();
        
        LocalDateTime appointmentDate = LocalDateTime.parse(date, formatter);
        if(isConflict(appointmentDate)){
            System.out.println("Jadwal telah terisi. Pilih waktu lain");
        } else{
            
        }
        
        Appointment appointment1 = new Appointment();
        appointment1.setDoctor(doctor1);
        appointment1.setPatient(patient1);
        appointment1.setAppointmentDate(appointmentDate);
        
        System.out.println("Janji temu berhasil dibuat: ");
        System.out.println("Doctor   : "+appointment1.getDoctor());
        System.out.println("Patient  : "+appointment1.getPatient());
        System.out.println("Datetime :"+appointment1.getAppointmentDate());
    }
}
