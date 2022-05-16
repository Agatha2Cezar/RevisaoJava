package atividade1Aluno;

public class Main {
    public static void main(String[] args) throws Exception {
        //Definindo a variavel do tipo Livro
        Livro livro1;

        //Criando um objeto da classe Livro
        livro1 = new Livro();

        //Atribuindo valores para o livro1
        //usando os setters
        livro1.setAno(1936);
        livro1.setAutor("Agatha Christie");
        livro1.setTitulo("Os Crimes ABC");

        //Recuperando valores do livro 1
        //Usando os getters
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor(a) do livro: " + livro1.getAutor());
        System.out.println("Ano de publicação: " + livro1.getAno());
    }
}
