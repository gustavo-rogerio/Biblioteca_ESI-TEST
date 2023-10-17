package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class VendaTest {

    @Test
    public void testConstrutorComParametros() {
        
        Autor autor = new Autor("Nome do Autor", "Sobrenome do Autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
        
        LivroEstoque livroEstoque = new LivroEstoque(livro, 100, 12);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 1);

        List<LivroVenda> listLivros = new ArrayList<LivroVenda>();
        listLivros.add(livroVenda);

        Venda venda = new Venda("Nome do Cliente", "PIX", 12.0, listLivros);

        Assert.assertEquals("Nome do Cliente", venda.nomeCliente);
        Assert.assertEquals("PIX", venda.formaPagamento);
        Assert.assertEquals(12.0, venda.valorDado, 0.1);

        Assert.assertEquals(listLivros.size(), venda.livros.size());

        for(int i = 0; i < venda.livros.size(); i++){

            LivroVenda ll = listLivros.get(i);
            LivroVenda vl = venda.livros.get(i);

            Assert.assertEquals(ll.quantidade, vl.quantidade);

            Assert.assertEquals(ll.livroDoEstoque.valor, vl.livroDoEstoque.valor, 0.1);
            Assert.assertEquals(ll.livroDoEstoque.exemplares, vl.livroDoEstoque.exemplares);
            
            Assert.assertEquals(ll.livroDoEstoque.livro.titulo, vl.livroDoEstoque.livro.titulo);
            Assert.assertEquals(ll.livroDoEstoque.livro.isbn, vl.livroDoEstoque.livro.isbn);
            Assert.assertEquals(ll.livroDoEstoque.livro.paginas, vl.livroDoEstoque.livro.paginas);

            Assert.assertEquals(ll.livroDoEstoque.livro.autor.nome, vl.livroDoEstoque.livro.autor.nome);
            Assert.assertEquals(ll.livroDoEstoque.livro.autor.sobrenome, vl.livroDoEstoque.livro.autor.sobrenome);

            Assert.assertEquals(ll.livroDoEstoque.livro.editora.nome, vl.livroDoEstoque.livro.editora.nome);
            
        }
    }

    @Test
    public void testConstrutorPadrao() {
        Venda venda = new Venda();
        Assert.assertNull(venda.nomeCliente);
        Assert.assertNull(venda.formaPagamento);
        Assert.assertEquals(0.0, venda.valorDado, 0.1);
        Assert.assertNull(venda.livros);
    }
}
