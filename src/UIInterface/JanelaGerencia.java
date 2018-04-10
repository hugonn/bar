package UIInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaGerencia extends JFrame {

	private JPanel contentPane;
	private JanelaCliente janelaFilho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaGerencia frame = new JanelaGerencia();
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
	public JanelaGerencia() {
		setTitle("Bar do Dibre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JanelaGerencia jg = this;
		
		JButton btnNewButton = new JButton("Cadastro Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
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
		btnNewButton.setBounds(69, 77, 287, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u00C1rea do Gerente");
		btnNewButton_1.setBounds(69, 153, 287, 23);
		contentPane.add(btnNewButton_1);
	}
}
