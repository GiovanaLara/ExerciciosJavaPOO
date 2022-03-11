package segundoexercicio;

public class VideoGame extends Produto{
    
    private String marca;
    private String modelo;
    private boolean isUsado;
    
    public VideoGame(String nome, double preco, int qtd) {
        super(nome, preco, qtd);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isIsUsado() {
        return isUsado;
    }

    public void setIsUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }
    
}
