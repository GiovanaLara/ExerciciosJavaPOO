package exercicioum;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean taLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;  
    private boolean status; 
    
    public void estadoAtual(){  
        System.out.println("Litros de combustível: " + this.getLitrosCombustivel());
        System.out.println("velocidade: " + this.getVelocidade());
    }
        
    public int acelerar(int v){
        if(v > 0){
            return v = this.velocidade = v + velocidade + 20;
        }  
        return 0;
    }
    public int abastecer (int quantidade){
        if(quantidade <= 60){
            return quantidade = this.litrosCombustivel = litrosCombustivel + quantidade;
        }  
        return 0;
    }
    public void frear(){
        
    }
    public void pintar(String cor){
        System.out.println("A cor desejada é: " + cor);
    
    }
    public void ligar (int v){
        if(this.velocidade > 0){
            System.out.println("ligado");            
        }
        else{
            System.out.println("desligado"); 
        }
    }
    
    public void desligar(){
         if(this.velocidade == 0){
             System.out.println("desligando veículo..."); 
         }
         else if (this.velocidade > 0){
             System.out.println("veículo em movimento, não foi possível desligar o carro."); 
         }
    }

    public Veiculo() {
        this.status = false;
        this.litrosCombustivel = 0;
    }
    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return this.km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean getisTaLigado() {
        return this.taLigado;
    }

    public void setTaLigado(boolean taLigado) {
        this.taLigado = taLigado;
    }

    public int getLitrosCombustivel() {
        return this.litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getisStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
