package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Persistence.Bar;
import Persistence.Pessoa;
import UIBusiness.GerenciadorBar;

class GerenciadorBarTest {
	
	private static GerenciadorBar gb;
	
	@BeforeAll
	public static void setData() {
		gb = new GerenciadorBar();
		Bar bar = gb.getBar();
		bar.addPessoa(new Pessoa("A", "1", 20, 'M'));
		bar.addPessoa(new Pessoa("B", "2", 20, 'M', 13));
		bar.addPessoa(new Pessoa("C", "3", 20, 'F'));
		bar.addPessoa(new Pessoa("D", "4", 20, 'F', 12));
	}

	@Test
	public void criaPessoa() {
		Bar bar = gb.getBar();
		int tam = bar.retornaPessoasBar();
		int expected = 4;
		assertEquals(expected, tam);
		bar.addPessoa(new Pessoa("E", "5", 20, 'M'));
		expected = 5;
		tam = bar.retornaPessoasBar();
		assertEquals(expected, tam);
	}
	
	@Test
	public void getSocios() {
		int expected = 2;
		int socios = gb.getSocios();
		assertEquals(expected, socios);
	}
	
	@Test
	public void getNaoSocios() {
		int expected = 2;
		int nsocios = gb.getNaoSocios();
		assertEquals(expected, nsocios);
	}
	
	@Test
	public void getQtdClientesBar() {
		int expected = 4;
		int qtd = gb.getQtdClientesBar();
		assertEquals(expected, qtd);
	}
	
	@Test
	public void getHomens() {
		int expected = 2;
		int qtd = gb.getHomens();
		assertEquals(expected, qtd);
	}
	
	@Test
	public void getMulheres() {
		int expected = 2;
		int qtd = gb.getHomens();
		assertEquals(expected, qtd);
	}
	
	@Test
	public void getClientesBar() {		
		String clientesNoBar = gb.getClientesBar();
		String expected = "A - CPF: 1\n" + 
				"B - CPF: 2\n" + 
				"C - CPF: 3\n" + 
				"D - CPF: 4\n" + 
				"E - CPF: 5\n";
		assertTrue(expected.equals(clientesNoBar));
	}
	
	@Test
	public void pesquisaCliente() {
		boolean pesquisa = gb.pesquisaCliente("1");
		assertTrue(pesquisa);
	}
	
	@Test
	public void registrarSaida() {
		int expected = 4;
		boolean remove = gb.registrarSaida("5");
		int qtd = gb.getQtdClientesBar();
		assertEquals(expected, qtd);
		assertTrue(remove);
	}

}
