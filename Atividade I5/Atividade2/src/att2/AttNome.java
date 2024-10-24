package att2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AttNome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimerNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttNome frame = new AttNome();
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
	public AttNome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Juntador de nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 20, 358, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Primeiro nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(46, 61, 110, 13);
		contentPane.add(lblNewLabel_1);
		
		txtPrimerNome = new JTextField();
		txtPrimerNome.setBounds(154, 59, 110, 19);
		contentPane.add(txtPrimerNome);
		txtPrimerNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sobrenome: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(46, 114, 110, 13);
		contentPane.add(lblNewLabel_2);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(154, 112, 110, 19);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblNomeCompleto = new JLabel("");
		lblNomeCompleto.setBounds(41, 171, 223, 13);
		contentPane.add(lblNomeCompleto);
		
		JButton btnJuntarNome = new JButton("Juntar ");
		btnJuntarNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem =  txtPrimerNome.getText()  + " " + txtSobrenome.getText();
				
				lblNomeCompleto.setText(mensagem);
			}
		});
		btnJuntarNome.setBounds(172, 194, 92, 21);
		contentPane.add(btnJuntarNome);
		
		
	}

}
