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

public class JanelaSaida extends JFrame {

	private JPanel contentPane;
	private JTextField TFCpf;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JanelaSaida frame = new JanelaSaida();
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
	public JanelaSaida(JanelaPrincipal jP) {
		setTitle("Registro de Sa\u00EDda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteSeuCpf = new JLabel("Digite Seu CPF:");
		lblDigiteSeuCpf.setBounds(25, 30, 91, 14);
		contentPane.add(lblDigiteSeuCpf);
		
		TFCpf = new JTextField();
		TFCpf.setBounds(25, 55, 133, 20);
		contentPane.add(TFCpf);
		TFCpf.setColumns(10);
		
		JanelaSaida jS = this;
		
		JButton btnRegistrarSaida = new JButton("Registrar Saida");
		btnRegistrarSaida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(TFCpf.getText()!= null) {
					boolean sucess = jP.registrarSaida(TFCpf.getText());
					
					if(sucess == true) {
						JOptionPane.showMessageDialog(jS, "Saída registrada com sucesso");
					}else {
						JOptionPane.showMessageDialog(jS, "CPF Não registrado no bar!");
					}
				}
			}
		});
		btnRegistrarSaida.setBounds(171, 116, 133, 23);
		contentPane.add(btnRegistrarSaida);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				jP.setVisible(true);
			}
		});
		btnVoltar.setBounds(25, 116, 89, 23);
		contentPane.add(btnVoltar);
	}

}
