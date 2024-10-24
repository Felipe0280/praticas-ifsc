package att1;
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

public class AttTemperatura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfarenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttTemperatura frame = new AttTemperatura();
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
	public AttTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Converta Farenheit para nh Celsius");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(34, 10, 360, 13);
		contentPane.add(lblNewLabel);
		
		txtfarenheit = new JTextField();
		txtfarenheit.setBounds(121, 67, 96, 19);
		contentPane.add(txtfarenheit);
		txtfarenheit.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celsius: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(34, 121, 77, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Farenheit:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(34, 69, 77, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblCelsius = new JLabel("");
		lblCelsius.setBounds(121, 121, 96, 13);
		contentPane.add(lblCelsius);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Converter converte = new Converter();
				
					double tempfareheint = Double.parseDouble(txtfarenheit.getText());
					double calculado = converte.convertendo(tempfareheint);
				
				 lblCelsius.setText(String.format("%.2f", calculado));
				return;
					}catch(NumberFormatException ex){
						JOptionPane.showMessageDialog(null, "Por favoe, colocar valor valido","Atençao", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		btnCalc.setBounds(164, 196, 85, 21);
		contentPane.add(btnCalc);
	}
}
