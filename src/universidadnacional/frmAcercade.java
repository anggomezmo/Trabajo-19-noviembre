package universidadnacional;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;

public class frmAcercade extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAcercade frame = new frmAcercade();
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
	public frmAcercade() {
		getContentPane().setBackground(new Color(153, 204, 255));
		setTitle("Acerca de\r\n");
		setBounds(100, 100, 475, 241);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(173, 146, 89, 23);
		getContentPane().add(btnNewButton);
		
		JTextArea txtrEsteProgramaFue = new JTextArea();
		txtrEsteProgramaFue.setBackground(new Color(255, 204, 153));
		txtrEsteProgramaFue.setText("Este programa fue realizado por Natalia Patiño Pérez\r\n & Angello Gómez Monsalve\r\npara la asignatura Programación orientada a objetos \r\ndirijida por el profesor Walter H Arboleda.\r\n");
		txtrEsteProgramaFue.setBounds(10, 11, 439, 100);
		getContentPane().add(txtrEsteProgramaFue);

	}
}
