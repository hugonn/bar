package UIBusiness;

import java.util.ArrayList;

import Persistence.Bar;
import Persistence.Pessoa;

public class GerenciadorBar {
	private Bar bd;
	 	public GerenciadorBar() {
	 		bd = new Bar();
	 		
	 	}
	 	
	 	public void criaPessoa(String nome, String cpf, int idade, char gen, int numSocio) {
	 		Pessoa pes;
	 		if(numSocio == 0) {
	 			pes = new Pessoa(nome,cpf,idade,gen);
	 		}else {
	 			pes = new Pessoa(nome,cpf,idade,gen,numSocio);
	 		}
	 		
	 		bd.addPessoa(pes);
	 	}
	 	
	 	public int getQtdClientesBar() {
	 		return bd.retornaPessoasBar();
	 	}
	 	
	 	public int getSocios() {
	 		return bd.retornaQtdClienteSocios();
	 	}
	 	
	 	public int getNaoSocios() {
	 		return bd.retornaPessoasBar() - bd.retornaQtdClienteSocios();
	 	}
	 	
	 	public int getHomens() {
	 		return bd.retornaQtdGenero('M');
	 	}
	 	
	 	public int getMulheres() {
	 		return bd.retornaQtdGenero('F');
	 	}
	 	
	 	public String getClientesBar() {
	 		ArrayList<Pessoa> lp = bd.retornaDados();
	 		
	 		String pessoas="";
	 		
	 		for(Pessoa p: lp) {
	 			pessoas+= p.getNome() +" - CPF: " + p.getCpf() +"\n";
	 		}
	 		
	 		return pessoas;
	 	}
	 	
	 	public boolean pesquisaCliente(String cpf) {
	 		
	 		return bd.pesquisaPessoa(cpf);
	 			
	 	}

}
