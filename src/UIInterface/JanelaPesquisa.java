package UIInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPesquisa extends JFrame {

	private JPanel contentPane;
	private JTextField TFCpf;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JanelaPesquisa frame = new JanelaPesquisa();
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
	public JanelaPesquisa(JanelaGerente jG) {
		setTitle("Pesquisa de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o CPF :");
		lblDigiteOCpf.setBounds(20, 23, 126, 14);
		contentPane.add(lblDigiteOCpf);
		
		TFCpf = new JTextField();
		TFCpf.setBounds(20, 55, 126, 20);
		contentPane.add(TFCpf);
		TFCpf.setColumns(10);
		
		JanelaPesquisa ws = this;
		
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean presente;
				if(TFCpf.getText() != null) {
					presente = jG.pesquisaCliente(TFCpf.getText());
					
					if(presente == true) {
						JOptionPane.showMessageDialog(ws, "A pessoa com o cpf: "+TFCpf.getText() + " está no bar");
					}else {
						JOptionPane.showMessageDialog(ws, "A pessoa com o cpf: "+TFCpf.getText() + " não está no bar");
					}
				}
			}
		});
		btnPesquisar.setBounds(203, 129, 89, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				jG.setVisible(true);
			}
		});
		btnVoltar.setBounds(20, 129, 89, 23);
		contentPane.add(btnVoltar);
	}
}
