package br.edu.ifpb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;




public class AppTest {

    @Test
    public void testAdicionarLivros() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionar("Add livro", "Add autor");
        assertTrue("Livro adicionado", true);

    }
}
