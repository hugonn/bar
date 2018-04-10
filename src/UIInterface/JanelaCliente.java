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

public class JanelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField TFNome;
	private JTextField TFIdade;
	private JanelaGerencia janelaPai;

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
	public JanelaCliente(JanelaGerencia janelaPai) {
		setTitle("\u00C1rea do Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.janelaPai = janelaPai;
		
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
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(284, 146, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				janelaPai.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 146, 89, 23);
		contentPane.add(btnVoltar);
	}
	
}
