/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided;

/**
 *
 * @author AfanRamadhan
 */
public class Cat extends Animal{
    @Override
    
    public void bark(){
        System.out.println("Mew");
    }
    
    public static void main(String[] args) {
        Cat fish = new Cat();
        fish.bark();
        
    }
}
