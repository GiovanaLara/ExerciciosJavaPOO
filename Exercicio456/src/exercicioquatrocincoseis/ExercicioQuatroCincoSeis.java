//exercicios 4, 5 e 6
package exercicioquatrocincoseis;

import java.util.ArrayList;

public class ExercicioQuatroCincoSeis {

    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<String>();
        //nome + idade
        nome.add("João (15)");
        nome.add("Leandro (21)");
        nome.add("Paulo (17)");
        nome.add("Jessica (18)");
        
        int []v = {15, 21, 17, 18};
        int idx_maior = buscar_maior(v);
        
        //parte 1
        System.out.println("Pessoas: " + nome.toString());
        System.out.println("_____________________________________________________________");
        System.out.println("A pessoa mais velha é: " + nome.get(1));
        System.out.printf("Que se encontra na posição >%d< da lista \n", idx_maior);
        System.out.println("_____________________________________________________________");
        
        System.out.println("Pessoas: " + nome.toString());
        
        System.out.println("_____________________________________________________________");

        //parte 2
        System.out.println("Pessoas com idade inferior a 18 foram removidas \n");
        System.out.println("a lista foi atualizada \n");
        nome.remove("João (15)");
        nome.remove("Paulo (17)");
        System.out.println("Pessoas: " + nome.toString());
        System.out.println("_____________________________________________________________");
        
        //parte 3
        if(nome.contains("Jessica (18)") == true){
        System.out.println("A lista possui o nome " + nome.get(1));
        }

    }
    
    private static int buscar_maior(int[] v){
        int maior = 0;
        
        for (int i = 1; i < v.length; i++){
            if (v[i] > v[maior]){
                maior =i;
            }
        }
        return maior;
    }

}
