package universidadnacional;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmCorriente extends JInternalFrame {
	private JTextField textv;
	private JTextField textr;
	private JTextField textc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCorriente frame = new frmCorriente();
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
	public frmCorriente() {
		setTitle("Calcular Corriente");
		setBounds(100, 100, 376, 239);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Corriente");
		lblNewLabel.setBounds(23, 110, 90, 14);
		getContentPane().add(lblNewLabel);
		
		textv = new JTextField();
		textv.setColumns(10);
		textv.setBounds(123, 21, 86, 20);
		getContentPane().add(textv);
		
		JLabel lblNewLabel_1 = new JLabel("Resistencia");
		lblNewLabel_1.setBounds(23, 65, 77, 14);
		getContentPane().add(lblNewLabel_1);
		
		textr = new JTextField();
		textr.setColumns(10);
		textr.setBounds(123, 62, 86, 20);
		getContentPane().add(textr);
		
		JLabel lblNewLabel_2 = new JLabel("Voltaje");
		lblNewLabel_2.setBounds(23, 24, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textc = new JTextField();
		textc.setColumns(10);
		textc.setBounds(123, 107, 86, 20);
		getContentPane().add(textc);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double corriente,resistencia, voltaje;
				voltaje=Double.parseDouble(textv.getText());
				resistencia=Double.parseDouble(textr.getText());
				corriente= Corriente.calcular_corriente(voltaje, resistencia);
				textc.setText(String.valueOf(corriente));
				
			}
		});
		btnNewButton.setBounds(23, 157, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textc.setText("");
				textv.setText("");
				textr.setText("");
				
			}
		});
		btnNewButton_1.setBounds(123, 157, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(222, 157, 89, 23);
		getContentPane().add(btnNewButton_2);

	}

}
