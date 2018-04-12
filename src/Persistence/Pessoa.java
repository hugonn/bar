package Persistence;

public class Pessoa {
	private String nome,cpf;
	private int idade;
	private char genero;
	private int numSocio;
	
	public Pessoa(){}

	public Pessoa(String nome, String cpf, int idade, char genero) {
		this(nome,cpf,idade,genero,0);
	}
	
	

	public Pessoa(String nome, String cpf, int idade, char genero, int numSocio) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.numSocio = numSocio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	
	
	
	
}
