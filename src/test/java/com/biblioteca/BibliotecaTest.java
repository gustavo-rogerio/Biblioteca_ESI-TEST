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
		Autor autor = new Autor("Nome do Autor", "Sobrenome do Autor");
		Editora editora = new Editora("Nome da Editora");
		Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
		biblioteca.AdicionarLivro(livro);
		Assert.assertEquals(1, biblioteca.livros.size());
	}

	@Test
	public void testRemoverLivro() {
		Autor autor = new Autor("Nome do Autor", "Sobrenome do Autor");
		Editora editora = new Editora("Nome da Editora");
		Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
		biblioteca.AdicionarLivro(livro);
		biblioteca.RemoverLivro(livro);
		Assert.assertEquals(0, biblioteca.livros.size());
	}

	@Test
	public void testAdicionarAutor() {
		Autor autor = new Autor("Nome do Autor", "Sobrenome do Autor");
		biblioteca.AdicionarAutor(autor);
		Assert.assertEquals(1, biblioteca.autores.size());
	}

	@Test
	public void testRemoverAutor() {
		Autor autor = new Autor("Nome do Autor", "Sobrenome do Autor");
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
		Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
		Editora editora = new Editora("Nome da Editora");
		Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
		LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);
		biblioteca.AdicionarEstoque(livroEstoque);
		Assert.assertEquals(1, biblioteca.estoque.size());
	}

	@Test
	public void testRemoverEstoque() {
		Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
		Editora editora = new Editora("Nome da Editora");
		Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
		LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);
		biblioteca.AdicionarEstoque(livroEstoque);
		biblioteca.RemoverEstoque(livroEstoque);
		Assert.assertEquals(0, biblioteca.estoque.size());
	}
}
