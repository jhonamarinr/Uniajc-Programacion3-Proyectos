/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Jhon
 */
public class SalaJuntas {
    
    private int capacidad;
    private boolean disponible;
    
    public SalaJuntas(int capacidad){  
        this.capacidad = capacidad;
        this.disponible = true;
    }
    
    public boolean disponibilidad(){
        return disponible;
    }
    
    public void reservar(){
        if(disponible){
        
            disponible=false;
            System.out.println("La Sala de Juntas ha sido RESERVADA");
        }
    }
    
    public void liberar(){
        disponible=true;
        System.out.println("La Sala de Juntas ha sido LIBERADA");
    }
}
