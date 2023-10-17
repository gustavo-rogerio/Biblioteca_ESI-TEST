package com.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BibliotecaTest {

	private Biblioteca biblioteca;

	@Before
    public void setUp() { 
      biblioteca = new Biblioteca();
    }

	@Test
    public void testAdicionarLivro() { 
      Livro livro = new Livro("12345", "Título do Livro", "Autor do Livro", "Editora do Livro");
      biblioteca.AdicionarLivro(livro);
      Assert.assertEquals(1, biblioteca.livros.size());
    }

	@Test
    public void testRemoverLivro() {
      Livro livro = new Livro("12345", "Título do Livro", "Autor do Livro", "Editora do Livro");
      biblioteca.AdicionarLivro(livro);
      biblioteca.RemoverLivro(livro);
      Assert.assertEquals(0, biblioteca.livros.size());
    }

	@Test
    public void testAdicionarAutor() {
      Autor autor = new Autor("Autor", "Sobrenome");
      biblioteca.AdicionarAutor(autor);
      Assert.assertEquals(1, biblioteca.autores.size());
    }

	@Test
    public void testRemoverAutor() {
      Autor autor = new Autor("Autor", "Sobrenome");
      biblioteca.AdicionarAutor(autor);
      biblioteca.RemoverAutor(autor);
      Assert.assertEquals(0, biblioteca.autores.size());
    }

    @Test
    public void testAdicionarEditora() {
      Editora editora = new Editora("Editora");
      biblioteca.AdicionarEditora(editora);
      Assert.assertEquals(1, biblioteca.editoras.size());
    }

	@Test
    public void testRemoverEditora() {
      Editora editora = new Editora("Editora");
      biblioteca.AdicionarEditora(editora);
      biblioteca.RemoverEditora(editora);
      Assert.assertEquals(0, biblioteca.editoras.size());
    }

    @Test
    public void testAdicionarEstoque() {
      LivroEstoque livroEstoque = new LivroEstoque(new Livro("12345", "Título", "Autor", "Editora"), 10);
      biblioteca.AdicionarEstoque(livroEstoque);
      Assert.assertEquals(1, biblioteca.estoque.size());
    }

    @Test
    public void testRemoverEstoque() {
      LivroEstoque livroEstoque = new LivroEstoque(new Livro("12345", "Título", "Autor", "Editora"), 10);
      biblioteca.AdicionarEstoque(livroEstoque);
      biblioteca.RemoverEstoque(livroEstoque);
      Assert.assertEquals(0, biblioteca.estoque.size());
    }
}
