/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiroexercicio;

import java.util.List;
import java.util.Random;

/**
 *
 * @author jvcki
 */
public class Guerreiro extends Personagem {
    
    private String nome;
    private int vida;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;
    
    private List<String> Habilidade;  

    public List<String> getHabilidade() {
        return Habilidade;
    }

    public void setMagia(List<String> Habilidade) {
        this.Habilidade = Habilidade;
    }
    public static void lvlUp(int level){
        level ++;
    }
    
    public void attack(){
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(300) + 1;
        int attack = this.forca * this.level + valor;
        System.out.println("**ataque efetuado*** + BÔNUS " + attack + " +");
    }
    
    public void aprenderMagia(){
        
    }
    
}
