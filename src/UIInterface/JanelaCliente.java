package UIInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Choice;
import java.awt.Label;

public class JanelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField TFNome;
	private JTextField TFIdade;
	private JTextField TFSocio;
	private JTextField TFCpf;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JanelaCliente frame = new JanelaCliente();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public JanelaCliente(JanelaPrincipal jP) {
		setTitle("\u00C1rea do Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 23, 46, 14);
		contentPane.add(lblNome);
		
		TFNome = new JTextField();
		TFNome.setBounds(10, 41, 185, 20);
		contentPane.add(TFNome);
		TFNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 72, 46, 14);
		contentPane.add(lblIdade);
		
		TFIdade = new JTextField();
		TFIdade.setBounds(10, 90, 86, 20);
		contentPane.add(TFIdade);
		TFIdade.setColumns(10);
		
		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				jP.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 181, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNmeroScio = new JLabel("N\u00FAmero S\u00F3cio:");
		lblNmeroScio.setBounds(98, 127, 97, 14);
		contentPane.add(lblNmeroScio);
		lblNmeroScio.setVisible(false);
		
		JCheckBox checkSocio = new JCheckBox("S\u00F3cio?");
		checkSocio.setBounds(6, 123, 67, 23);
		contentPane.add(checkSocio);
		
		if(checkSocio.isSelected())System.out.println("test");
		checkSocio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkSocio.isSelected()) {
					lblNmeroScio.setVisible(true);
					TFSocio.setVisible(true);
				}else {
					lblNmeroScio.setVisible(false);
					TFSocio.setVisible(false);
				}
			}
		});
		
		TFSocio = new JTextField();
		TFSocio.setBounds(199, 124, 118, 20);
		contentPane.add(TFSocio);
		TFSocio.setColumns(10);
		TFSocio.setVisible(false);
		
		Choice gen = new Choice();
		gen.setBounds(173, 90, 58, 20);
		gen.add("M");
		gen.add("F");
		contentPane.add(gen);
		
		Label label = new Label("G\u00EAnero:");
		label.setBounds(169, 67, 62, 22);
		contentPane.add(label);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TFNome.getText()!=null && TFIdade.getText()!=null) {
					
					if(!checkSocio.isSelected()) {
						jP.setPessoa(TFNome.getText(), TFCpf.getText(), Integer.parseInt(TFIdade.getText()), gen.getSelectedItem());
						
					}else {
						if(TFSocio.getText() != null) {
							jP.setPessoaSocio(TFNome.getText(), TFCpf.getText(), Integer.parseInt(TFIdade.getText()), gen.getSelectedItem(), Integer.parseInt(TFSocio.getText()));
						}
					}
				}
			}
		});
		btnCadastrar.setBounds(285, 181, 89, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(224, 23, 46, 14);
		contentPane.add(lblCpf);
		
		TFCpf = new JTextField();
		TFCpf.setBounds(224, 41, 132, 20);
		contentPane.add(TFCpf);
		TFCpf.setColumns(10);
	}
}
