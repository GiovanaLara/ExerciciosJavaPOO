package segundoexercicio;

public class Livro extends Produto{
    
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro(String autor, String tema, int qtdPag, String nome, double preco, int qtd) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }
       
    //public Livro(String nome, double preco, int qtd) {
    //    super(nome, preco, qtd);
    //}

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }
    
}
