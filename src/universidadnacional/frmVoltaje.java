package universidadnacional;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmVoltaje extends JInternalFrame {
	private JTextField textc;
	private JTextField textr;
	private JTextField textv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVoltaje frame = new frmVoltaje();
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
	public frmVoltaje() {
		setTitle("Calcular Voltaje\r\n");
		setBounds(100, 100, 349, 234);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Corriente");
		lblNewLabel.setBounds(26, 24, 77, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resistencia");
		lblNewLabel_1.setBounds(26, 65, 77, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Voltaje");
		lblNewLabel_2.setBounds(26, 110, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		textc = new JTextField();
		textc.setBounds(126, 21, 86, 20);
		getContentPane().add(textc);
		textc.setColumns(10);
		
		textr = new JTextField();
		textr.setBounds(126, 62, 86, 20);
		getContentPane().add(textr);
		textr.setColumns(10);
		
		textv = new JTextField();
		textv.setBounds(126, 107, 86, 20);
		getContentPane().add(textv);
		textv.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double corriente,resistencia, voltaje;
				corriente=Double.parseDouble(textc.getText());
				resistencia=Double.parseDouble(textr.getText());
				voltaje= Voltaje.calcular_voltaje(corriente, resistencia);
				textv.setText(String.valueOf(voltaje));
			}
		});
		btnNewButton.setBounds(26, 157, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textc.setText("");
				textv.setText("");
				textr.setText("");
				
			}
		});
		btnNewButton_1.setBounds(126, 157, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(225, 157, 89, 23);
		getContentPane().add(btnNewButton_2);

	}

}
