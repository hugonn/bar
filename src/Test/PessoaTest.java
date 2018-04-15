package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Persistence.Pessoa;

class PessoaTest {
	
	private static Pessoa pessoa;

	@BeforeAll
	public static void Pessoa() {
		setPessoa();
	}
	
	public static Pessoa setPessoa() {
		String nome = "Bruno";
		String cpf = "00000000000";
		int idade = 26;
		char genero = 'M';
		int numSocio = 1234;
		pessoa = new Pessoa(nome, cpf, idade, genero, numSocio);
		return pessoa;
	}
	
	@Test
	public void getNome() {
		pessoa = setPessoa();
		String expected = "Bruno";
		String nome = pessoa.getNome();
		assertEquals(expected, nome);
	}
	
	@Test
	public void setName() {
		String novoNome = "Hugo";
		String expected = novoNome;
		pessoa.setNome(novoNome);
		String nome = pessoa.getNome();
		assertEquals(expected, nome);
	}
	
	@Test
	public void getCpf() {
		pessoa = setPessoa();
		String expected = "00000000000";
		String cpf = pessoa.getCpf();
		assertEquals(expected, cpf);
	}
	
	@Test
	public void setCpf() {
		String novoCpf = "99999999999";
		String expected = novoCpf;
		pessoa.setCpf(novoCpf);
		String cpf = pessoa.getCpf();
		assertEquals(expected, cpf);
	}
	
	@Test
	public void getIdade() {
		pessoa = setPessoa();
		int expected = 26;
		int idade = pessoa.getIdade();
		assertEquals(expected, idade);
	}
	
	@Test
	public void setIdade() {
		int novaIdade = 25;
		int expected = novaIdade;
		pessoa.setIdade(novaIdade);
		int idade = pessoa.getIdade();
		assertEquals(expected, idade);
	}

	@Test
	public void getGenero() {
		pessoa = setPessoa();
		char expected = 'M';
		char genero = pessoa.getGenero();
		assertEquals(expected, genero);
	}
	
	@Test
	public void setGenero() {
		char novoGenero = 'F';
		char expected = novoGenero;
		pessoa.setGenero(novoGenero);
		char genero = pessoa.getGenero();
		assertEquals(expected, genero);
	}

	@Test
	public void getNumSocio() {
		pessoa = setPessoa();
		int expected = 1234;
		int numSocio = pessoa.getNumSocio();
		assertEquals(expected, numSocio);
	}
	
	@Test
	public void setNumSocio() {
		int novoNumSocio = 9876;
		int expected = novoNumSocio;
		pessoa.setNumSocio(novoNumSocio);
		int numSocio = pessoa.getNumSocio();
		assertEquals(expected, numSocio);
	}
}
