
package segundoexercicio;

import java.util.Scanner;

public class SegundoExercicio {

    public static void main(String[] args) {
        
        double qtdLivros = 89;
        double qtdVideoGames = 90;
        
        if(qtdLivros > 0){
            System.out.printf("Há: " + qtdLivros + " livros no estoque \n");
        }else{
            System.out.printf("Não há livros no estoque \n");
        }
        
        if(qtdVideoGames> 0){
            System.out.printf("Há: " + qtdVideoGames + " video games no estoque \n");
        }else{
            System.out.printf("Não há video games no estoque \n");
        }
        
        System.out.println("|Livros| \n escolha a opção de livro desejada: \n [1]: infantil \n [2]: comedia \n [3]: romance \n [4]: educativo");
        double preco = 5.0;
        int infantil = 1;
        int comedia = 2;
        int romance = 3;
        int educativo = 4;
        
        System.out.println("Digite o número que corresponde ao gênero:");
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        if(N == 1 || N == 2 || N == 3){
            double percentual = 10.0 / 100.0;
            double valorFinal = preco + (percentual * preco);
            System.out.println("valor: " + valorFinal);
            
        }else if(N == 4){
            double valorFinal = preco;
            System.out.println("preco:" + valorFinal);
        }
        
        
        
        System.out.println("|Video Game|");
        System.out.println("Video Game usado: \n [1]: sim \n [2]: nao");
        int V = sc.nextInt();
        
        if(V == 1){
            double percentual = 25.0 / 100.0;
            double precoVg = 10.0;
            double valorFinal = precoVg + (percentual * precoVg);
            System.out.println("valor: " + valorFinal);
        }
        else{
            double percentual = 45.0 / 100.0;
            double precoVg = 10.0;
            double valorFinal = precoVg + (percentual * precoVg);
            System.out.println("valor: " + valorFinal);
        }
        
        double precoVg = 10.0;
        double patrimonio = qtdLivros * preco * precoVg;
        
        System.out.println("patrimonio: " + patrimonio);
        
    }
    
}
