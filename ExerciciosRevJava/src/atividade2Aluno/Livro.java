package atividade2Aluno;

public class Livro {
    private String nome;
    private Autor autor;
    private double preco;
    private int qtd = 0;

    public Livro(String nome, Autor autor, double preco, int qtd) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + qtd + "]";
    }

}
