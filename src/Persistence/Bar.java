package Persistence;

import java.util.ArrayList;

public class Bar {
	private ArrayList <Pessoa> pessoasBar;
	
	public Bar() {
		pessoasBar = new ArrayList<Pessoa>();	
	}
	
	public ArrayList<Pessoa> retornaDados() {
		return pessoasBar;
	}
	
	public void addPessoa(Pessoa pes) {
		if(pes!=null)
			pessoasBar.add(pes);
	}
	
	public boolean removePessoa(String cpf) {
		for(Pessoa p: pessoasBar) {
			if(p.getCpf().equals(cpf)) {
				pessoasBar.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public int retornaPessoasBar() {
		return pessoasBar.size();
	}
	
	public int retornaQtdGenero(char genero) {
		int qtd = 0;
		for(Pessoa p: pessoasBar) {
			if(p.getGenero() == genero) {
				qtd++;
			}
		}
		return qtd;
	}
	
	public Pessoa retornaClienteCpf(String cpf) {
		for(Pessoa p: pessoasBar) {
			if(p.getCpf().equals(cpf)) return p;
		}
		return null;
	}
	
	public int retornaQtdClienteSocios() {
		int qtd = 0;
		for(Pessoa p: pessoasBar) {
			if(p.getNumSocio()!=0) 
				qtd++;
		}
		return qtd;
	}
}
