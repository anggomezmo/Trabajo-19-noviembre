package universidadnacional;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmPitagoras extends JInternalFrame {
	private JTextField txta;
	private JTextField txtb;
	private JTextField txth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPitagoras frame = new frmPitagoras();
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
	public frmPitagoras() {
		setTitle("Calcular hipotenusa\r\n");
		setBounds(100, 100, 388, 268);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lado A\r\n");
		lblNewLabel.setBounds(36, 36, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblLadoB = new JLabel("Lado B");
		lblLadoB.setBounds(36, 84, 46, 14);
		getContentPane().add(lblLadoB);
		
		JLabel lblLadoC = new JLabel("Hipotenusa\r\n");
		lblLadoC.setBounds(36, 130, 108, 14);
		getContentPane().add(lblLadoC);
		
		txta = new JTextField();
		txta.setBounds(176, 33, 86, 20);
		getContentPane().add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(176, 81, 86, 20);
		getContentPane().add(txtb);
		
		txth = new JTextField();
		txth.setColumns(10);
		txth.setBounds(176, 127, 86, 20);
		getContentPane().add(txth);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double hipotenusa,catetoa,catetob;
				catetoa=Double.parseDouble(txta.getText());
				catetob=Double.parseDouble(txtb.getText());
				hipotenusa=Pitagoras.calcular_hipotenusa(catetoa, catetob);
				txth.setText(String.valueOf(hipotenusa));
				
				
			}
		});
		btnNewButton.setBounds(22, 176, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setText("");
				txtb.setText("");
				txth.setText("");
			}
		});
		btnNewButton_1.setBounds(144, 176, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		dispose();
			}
		});
		btnNewButton_2.setBounds(256, 176, 89, 23);
		getContentPane().add(btnNewButton_2);

	}
}
