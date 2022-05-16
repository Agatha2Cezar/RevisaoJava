package atividade2Aluno;

public class Main {
     public static void main(String[] args) {

          Autor autor1 = new Autor("Monteiro Lobato", "monteirolobato@gmail.com", 'M');

          Livro livro = new Livro("Sitio do pica pau Amarelo", autor1, 29.90, 1);
     
          System.out.println(livro.toString());
          System.out.println(autor.toString());
     }

}