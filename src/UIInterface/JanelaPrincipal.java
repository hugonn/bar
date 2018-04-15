package UIInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import UIBusiness.GerenciadorBar;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JanelaCliente janelaFilho;
	private JanelaGerente janelaFilhoGerente; 
	private GerenciadorBar gb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Bar do Dibre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JanelaPrincipal jg = this;
		gb = new GerenciadorBar();
		
		
		JButton btnNovoCliente = new JButton("Cadastro Cliente");
		btnNovoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(janelaFilho == null) {
					janelaFilho = new JanelaCliente(jg);
					dispose();
					janelaFilho.setVisible(true);
				}else{
					dispose();
					System.out.println("teste Criação tela");
					janelaFilho.setVisible(true);
					
				}
			}
		});
		btnNovoCliente.setBounds(71, 37, 251, 23);
		contentPane.add(btnNovoCliente);
		
		JButton btnGerente = new JButton("\u00C1rea do Gerente");
		btnGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(janelaFilhoGerente == null) {
					janelaFilhoGerente = new JanelaGerente(jg);
					dispose();
					janelaFilhoGerente.setVisible(true);
				}else{
					dispose();
					janelaFilhoGerente.setVisible(true);
					
				}
			}
		});
		btnGerente.setBounds(71, 92, 251, 23);
		contentPane.add(btnGerente);
	}
	public void setPessoa(String nome, String cpf, int idade,String genero) {
		gb.criaPessoa(nome,cpf,idade,genero.charAt(0),0);
	}
	public void setPessoaSocio(String nome, String cpf, int idade,String genero, int numSocio) {
		gb.criaPessoa(nome,cpf,idade,genero.charAt(0),numSocio);
	}
	
	public int getQtdClientesBar() {
		return gb.getQtdClientesBar();
	}
	
	public int getSociosBar() {
		return gb.getSocios();
	}
	public int getNaoSocios() {
		return gb.getNaoSocios();
	}
	
	public int getHomens() {
		return gb.getHomens();
	}
	
	public int getMulheres() {
		return gb.getMulheres();
	}
	
	public String getClientesBar() {
		return gb.getClientesBar();
	}
	
	public boolean pesquisaCliente(String cpf) {
		return gb.pesquisaCliente(cpf);
	}
	

}
