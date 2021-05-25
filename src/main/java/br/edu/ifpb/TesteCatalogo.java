package br.edu.ifpb;

public class TesteCatalogo {
    public static void main( String[] args ) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionar("xxxxxxxxx", "Joao");
        catalogo.adicionar("yyyyyyyyy","Victor");
        catalogo.adicionar("zzzzzzzzz","Pedro");
        
        /*Adicionando dessa forma, caso o programa seja eventualmente
         emplementado para usários, não teria limites para adicionar livros como
         seria se adicionasse sempre usando --> Livro livro1 = new Livro();
         */

        System.out.println("\nLivros no catalogo: " + catalogo.listar());
        System.out.println("Resultado da busca: " + catalogo.buscar("yyyyyyyyy"));

        System.out.println("\n--------------------------\n");

        catalogo.remover("yyyyyyyyy");

        System.out.println("\nLivros no catalogo: " + catalogo.listar());





    }
}
