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
public class ExercicioSete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente f1 = new Gerente();
        f1.Salario = 1975.00;
        f1.Idade = 25;
        f1.Nome = "Tatiana";
        System.out.println("> Nome: " + f1.Nome);
        System.out.println("> Idade: " + f1.Idade);
        System.out.println("> Cargo: Gerente");
        System.out.println("> Salário: " + f1.Salario);
        System.out.println("> Bonificação recebida: " + f1.bonificacao);
        System.out.println("> TOTAL SALÁRIO: " + (f1.bonificacao + f1.Salario));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        
        Supervisor f2 = new Supervisor();
        f2.Salario = 1300.00;
        f2.Idade = 21;
        f2.Nome = "Fabrício";
        System.out.println("> Nome: " + f2.Nome);
        System.out.println("> Idade: " + f2.Idade);
        System.out.println("> Cargo: Supervisor");
        System.out.println("> Salário: " + f2.Salario);
        System.out.println("> Bonificação recebida: " + f2.bonificacaoDois);
        System.out.println("> TOTAL SALÁRIO: " + (f2.bonificacaoDois+ f2.Salario));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -"); 
        
        Vendedor f3 = new Vendedor();
        f3.Salario = 800.00;
        f3.Idade = 16;
        f3.Nome = "Jorge";
        System.out.println("> Nome: " + f3.Nome);
        System.out.println("> Idade: " + f3.Idade);
        System.out.println("> Cargo: Vendedor");
        System.out.println("> Salário: " + f3.Salario);
        System.out.println("> Bonificação recebida: " + f3.bonificacaoTres);
        System.out.println("> TOTAL SALÁRIO: " + (f3.bonificacaoTres+ f3.Salario));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");         
    }
    
}

