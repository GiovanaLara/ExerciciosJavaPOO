/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiroexercicio;

public class TerceiroExercicio {

    public static void main(String[] args) {
        System.out.println("Mago");
        Mago m1 = new Mago();        
        m1.attack();
        System.out.println("________________________________________");

        System.out.println("Guerreiro");               
        Guerreiro g1 = new Guerreiro();
        g1.attack();
    }
    
}
