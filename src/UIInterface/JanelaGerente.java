package UIInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JanelaGerente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JanelaGerente frame = new JanelaGerente();
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
	public JanelaGerente(JanelaPrincipal jP) {
		setTitle("Bar do Dibre - \u00C1rea Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JanelaGerente jG = this;
		
		JLabel lblQtdClientes = new JLabel("qtd Clientes:");
		lblQtdClientes.setBounds(280, 31, 78, 14);
		contentPane.add(lblQtdClientes);
		
		JLabel lblQtd = new JLabel("");
		lblQtd.setBounds(358, 31, 46, 14);
		contentPane.add(lblQtd);
		
		JButton btnQCliente = new JButton("Quantidade de Clientes");
		btnQCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer qtdC = jP.getQtdClientesBar();
				lblQtd.setText(qtdC.toString());
			}
		});
		btnQCliente.setBounds(72, 27, 198, 23);
		contentPane.add(btnQCliente);
		
		JButton btnListCli = new JButton("Listar Clientes");
		btnListCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pessoas = jP.getClientesBar();
				
				JOptionPane.showMessageDialog(jG, pessoas);
			}
		});
		btnListCli.setBounds(72, 61, 198, 23);
		contentPane.add(btnListCli);
		
		JButton btnNewButton = new JButton("Pesquisar Cliente");
		btnNewButton.setBounds(72, 95, 198, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblQtdScios = new JLabel("S:");
		lblQtdScios.setBounds(280, 133, 22, 14);
		contentPane.add(lblQtdScios);
		
		JLabel lblS = new JLabel("");
		lblS.setBounds(293, 133, 30, 14);
		contentPane.add(lblS);
		
		JLabel lblNs = new JLabel("NS:");
		lblNs.setBounds(339, 133, 35, 14);
		contentPane.add(lblNs);
		
		JLabel lblNS = new JLabel("");
		lblNS.setBounds(358, 133, 46, 14);
		contentPane.add(lblNS);
		
		JLabel lbl = new JLabel("M:");
		lbl.setBounds(280, 167, 22, 14);
		contentPane.add(lbl);
		
		JLabel lblM = new JLabel("");
		lblM.setBounds(303, 167, 20, 14);
		contentPane.add(lblM);
		
		JLabel lbll = new JLabel("F:");
		lbll.setBounds(339, 167, 22, 14);
		contentPane.add(lbll);
		
		JLabel lblF = new JLabel("");
		lblF.setBounds(349, 167, 22, 14);
		contentPane.add(lblF);
		
		JButton btnNewButton_1 = new JButton("S\u00F3cios no Bar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer qtdS = jP.getSociosBar();
				Integer qtdNS = jP.getNaoSocios();
				
				lblS.setText(qtdS.toString());
				lblNS.setText(qtdNS.toString());
				
			}
		});
		btnNewButton_1.setBounds(72, 129, 198, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clientes por G\u00EAnero");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer qtdM = jP.getHomens();
				Integer qtdF = jP.getMulheres();
				
				lblM.setText(qtdM.toString());
				lblF.setText(qtdF.toString());
				
			}
		});
		btnNewButton_2.setBounds(72, 163, 198, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblM.setText("");
				lblF.setText("");
				lblS.setText("");
				lblNS.setText("");
				lblQtd.setText("");
				
				dispose();
				jP.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(72, 197, 198, 23);
		contentPane.add(btnNewButton_3);
		
		
		
		
		
		
	}
}
