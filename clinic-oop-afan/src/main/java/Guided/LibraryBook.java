/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Guided;

/**
 *
 * @author AfanRamadhan
 */
public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public boolean getIsBorrowed(){
        return this.isBorrowed;
    }
    
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook();
        lb.setTitle("Petualangan Ramzi");
        lb.setAuthor("Julio");
        lb.setIsBorrowed(true);
        
        System.out.println("Title: "+lb.title);
        System.out.println("Author: "+lb.author);
        System.out.println("Is borrowed: "+lb.isBorrowed);
    }    
}
