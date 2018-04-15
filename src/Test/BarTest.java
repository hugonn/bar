package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Persistence.Bar;
import Persistence.Pessoa;

class BarTest {
	
	private static Bar bar;
	private static Pessoa pessoa;
	private static ArrayList<Pessoa> clientesTest;

	@BeforeAll
	public static void setData() {
		clientesTest = new ArrayList<Pessoa>();
		String nome = "Bruno";
		String cpf = "00000000000";
		int idade = 26;
		char genero = 'M';
		bar = new Bar();
		pessoa = new Pessoa(nome, cpf, idade, genero);
		clientesTest.add(pessoa);
		
		nome = "Hugo";
		cpf = "11111111111";
		idade = 25;
		genero = 'M';
		pessoa = new Pessoa(nome, cpf, idade, genero);
		clientesTest.add(pessoa);
		
		nome = "Barbara";
		cpf = "22222222222";
		idade = 22;
		genero = 'F';
		int numSocio = 1234;
		pessoa = new Pessoa(nome, cpf, idade, genero, numSocio);
		clientesTest.add(pessoa);
		
		nome = "Helena";
		cpf = "33333333333";
		idade = 24;
		genero = 'F';
		pessoa = new Pessoa(nome, cpf, idade, genero);
		clientesTest.add(pessoa);
		
	}
	
	@Test
	public void addPessoa() {
		String nome = "Bruno";
		String cpf = "00000000000";
		int idade = 26;
		char genero = 'M';
		bar = new Bar();
		pessoa = new Pessoa(nome, cpf, idade, genero);
		assertNotNull(pessoa);
		bar.addPessoa(pessoa);
		int tamanho = bar.retornaPessoasBar();
		int expected = 1;
		assertEquals(expected, tamanho);
		nome = "Hugo";
		cpf = "11111111111";
		idade = 25;
		genero = 'M';
		pessoa = new Pessoa(nome, cpf, idade, genero);
		assertNotNull(pessoa);
		bar.addPessoa(pessoa);
		tamanho = bar.retornaPessoasBar();
		expected = 2;
		assertEquals(expected, tamanho);
	}

	@Test
	public void removePessoa() {
		bar = new Bar();
		for(Pessoa p: clientesTest) {
			bar.addPessoa(p);
		}
		ArrayList<Pessoa> clientes = bar.retornaDados();
		assertNotNull(clientes);
		
		String cpf = "11111111111";
		boolean remove = bar.removePessoa(cpf);
		int expected = 3;
		int tamanho = bar.retornaPessoasBar();
		assertEquals(expected, tamanho);
		assertTrue(remove);
		
		cpf = "99999999999";
		remove = bar.removePessoa(cpf);
		assertEquals(expected, tamanho);
		assertFalse(remove);
	}
	
	@Test
	public void pesquisaPessoa() {
		bar = new Bar();
		for(Pessoa p: clientesTest) {
			bar.addPessoa(p);
		}
		ArrayList<Pessoa> clientes = bar.retornaDados();
		assertNotNull(clientes);
		
		String cpf = "11111111111";
		boolean pesquisa = bar.pesquisaPessoa(cpf);
		assertTrue(pesquisa);
		
		cpf = "99999999999";
		pesquisa = bar.pesquisaPessoa(cpf);
		assertFalse(pesquisa);
	}
	
	@Test
	public void retornaPessoaBar() {
		bar = new Bar();
		int tamanho = bar.retornaPessoasBar();
		int expected = 0;
		assertEquals(expected, tamanho);
		for(Pessoa p: clientesTest) {
			bar.addPessoa(p);
		}
		expected = 4;
		tamanho = bar.retornaPessoasBar();
		assertEquals(expected, tamanho);
		
	}

	@Test
	public void retornarQtdGenero() {
		bar = new Bar();
		int expected = 0;
		int m = bar.retornaQtdGenero('M');
		int f = bar.retornaQtdGenero('F');
		assertEquals(expected, m);
		assertEquals(expected, f);
		for(Pessoa p: clientesTest) {
			bar.addPessoa(p);
		}
		expected = 2;
		m = bar.retornaQtdGenero('M');
		f = bar.retornaQtdGenero('F');
		assertEquals(expected, m);
		assertEquals(expected, f);
	}
	
	@Test
	public void retornaClienteCpf() {
		bar = new Bar();
		for(Pessoa p: clientesTest) {
			bar.addPessoa(p);
		}
		String cpf = "11111111111";
		Pessoa expected = new Pessoa("Hugo", "11111111111", 25, 'M');
		Pessoa pessoa = bar.retornaClienteCpf(cpf);
//		assertTrue(expected.equals(pessoa));
		
		
		cpf = "99999999999";
		expected = null;
		pessoa = bar.retornaClienteCpf(cpf);
		assertEquals(expected, pessoa);
	}
	
	@Test
	public void retornaQtdClienteSocios() {
		bar = new Bar();
		for(Pessoa p: clientesTest) {
			bar.addPessoa(p);
		}
		int expected = 1;
		int qtdSocios = bar.retornaQtdClienteSocios();
		assertEquals(expected, qtdSocios);
	}
	
}
