package exercicioum;

public class ExercicioUm {

    
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.acelerar(1);        
        v1.abastecer(5);
        v1.estadoAtual();
        v1.getVelocidade();
        v1.pintar("verde");
        v1.ligar(0);
        v1.desligar();
        }
    
}
