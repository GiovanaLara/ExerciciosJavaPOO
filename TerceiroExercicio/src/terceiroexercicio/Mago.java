/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiroexercicio;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jvcki
 */
public class Mago extends Personagem {
    
    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;
    
    private List<String> Magia;  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    public List<String> getMagia() {
        return Magia;
    }

    public void setMagia(List<String> Magia) {
        this.Magia = Magia;
    }
    
    public static void lvlUp(int level){
        level ++;
    }
    
        void level() {
        level ++;
        //int level = this.level + this.inteligencia + mana;
        //System.out.println("**" + level);  
    }
    
    public void attack(){
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(300) + 1;
        int attack = this.inteligencia * this.level + valor;
        System.out.println("**ataque efetuado*** + BÔNUS " + attack + " +");
    }
    
    public void aprenderMagia(){
        
    }   
}
