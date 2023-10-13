/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop6;

/**
 *
 * @author JMMVF
 */
public class POOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Persona persona = new Persona(18, "Acambaro Lt 19 Mz 16", "Isabela", "Mendoza");
        System.out.println(persona.toString());
        persona.hablar("Hola, soy una persona");
    }
    
}
