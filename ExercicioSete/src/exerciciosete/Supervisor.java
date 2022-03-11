/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosete;

/**
 *
 * @author Giovana Lara
 */
public class Supervisor extends Funcionario {
    
    public double bonificacaoDois = 5000.00;
    
    @Override
    public void bonificacao(){
        this.Salario = this.Salario + bonificacaoDois;
    }
}
