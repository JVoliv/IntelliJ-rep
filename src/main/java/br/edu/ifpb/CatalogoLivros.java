package br.edu.ifpb;

import java.util.ArrayList;

public class CatalogoLivros {

    ArrayList<Livro> livros = new ArrayList();



    public void adicionar(String titulo, String autor){
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);

    }

    public void remover(String titulo){
        for(int i = 0; i<livros.size(); i++){
            Livro livro = livros.get(i);
            if(livro.getTitulo().equals(titulo)){
                livros.remove(livro);
                System.out.println("Livro "+ titulo +" removido.");
                break;
            }
        }

    }

    public String buscar(String titulo){
        for(Livro livro: livros){
            if(livro.getTitulo().equals(titulo)){
                return livro.getTitulo();
            }
        }
        return titulo;
    }

    public String listar(){
        StringBuilder listagem = new StringBuilder();
        for (Livro livro : livros){
            listagem.append(livro.getTitulo()).append(" \n");
        }
        return listagem.deleteCharAt(listagem.length() - 2).toString();
    }


}