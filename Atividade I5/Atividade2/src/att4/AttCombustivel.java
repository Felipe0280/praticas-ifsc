package att4;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AttCombustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecoLitro;
	private JTextField txtValorAbas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttCombustivel frame = new AttCombustivel();
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
	public AttCombustivel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculo de gasolina");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(44, 10, 245, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Preco por litro: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(44, 55, 118, 13);
		contentPane.add(lblNewLabel_1);
		
		txtPrecoLitro = new JTextField();
		txtPrecoLitro.setBounds(44, 86, 96, 19);
		contentPane.add(txtPrecoLitro);
		txtPrecoLitro.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor de abastecimento: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(44, 134, 162, 13);
		contentPane.add(lblNewLabel_2);
		
		txtValorAbas = new JTextField();
		txtValorAbas.setBounds(44, 166, 96, 19);
		contentPane.add(txtValorAbas);
		txtValorAbas.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorLitro = Double.parseDouble(txtPrecoLitro.getText()); 
				double valorDeAbas = Double.parseDouble(txtValorAbas.getText());
				
				double Litros = (valorDeAbas / valorLitro);
				JOptionPane.showMessageDialog(null,"A quantida de litros que poderam ser abastecidos é: "+Litros);
			}
		});
		btnCalcular.setBounds(171, 213, 85, 21);
		contentPane.add(btnCalcular);
	}

}
