package UIInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	public JanelaGerente(JanelaPrincipal jg) {
		setTitle("Bar do Dibre - \u00C1rea Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQCliente = new JButton("Quantidade de Clientes");
		btnQCliente.setBounds(72, 27, 281, 23);
		contentPane.add(btnQCliente);
		
		JButton btnListCli = new JButton("Listar Clientes");
		btnListCli.setBounds(72, 61, 281, 23);
		contentPane.add(btnListCli);
		
		JButton btnNewButton = new JButton("Pesquisar Cliente");
		btnNewButton.setBounds(72, 95, 281, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("S\u00F3cios no Bar");
		btnNewButton_1.setBounds(72, 129, 281, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clientes por G\u00EAnero");
		btnNewButton_2.setBounds(72, 163, 281, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				jg.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(72, 197, 281, 23);
		contentPane.add(btnNewButton_3);
	}
}
