/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A1_Ejercicio3;

/**
 *
 * @author Jhon
 */
public class MainClassSJ {
    
    public static void main(String[] args) {
        
        ModelClassSalaJuntas sala = new ModelClassSalaJuntas(10);
        
        System.out.println("Estado actual de la Sala de Juntas: "+(sala.disponibilidad()?"Disponible":"Ocupada"));
        
        sala.reservar();
        sala.reservar();
        sala.liberar();
        
        System.out.println("Estado actual de la Sala de Juntas: "+(sala.disponibilidad()?"Disponible":"Ocupada"));
        
    }
    
}
