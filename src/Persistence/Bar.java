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
	
	public void setPessoa(Pessoa pes) {
		if(pes!=null)
			pessoasBar.add(pes);
	}
	
	public int retornaPessoasBar() {
		return pessoasBar.size();
	}

}
