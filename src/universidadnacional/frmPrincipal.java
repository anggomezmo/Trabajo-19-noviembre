package universidadnacional;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class frmPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setTitle("Universidad Nacional de Colombia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JDesktopPane dp = new JDesktopPane();
		dp.setBackground(new Color(255, 255, 102));
		getContentPane().add(dp, BorderLayout.CENTER);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
		dispose();
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		
		JMenu mnNewMenu_1 = new JMenu("Pitágoras");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Calcular pitágoras");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frmPitagoras pitagoras = new frmPitagoras();
			
			
		dp.add(pitagoras);
		pitagoras.setClosable(true);
		pitagoras.setVisible(true);
				
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		
	
		
		
		JMenu mnNewMenu_2 = new JMenu("Ohm");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Calcular voltaje");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVoltaje voltaje = new frmVoltaje();
				
				
				dp.add(voltaje);
				voltaje.setClosable(true);
				voltaje.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Calcular corriente");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
frmCorriente corriente = new frmCorriente();
				
				
				dp.add(corriente);
				corriente.setClosable(true);
				corriente.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_3 = new JMenu("Acerca");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Acerca de");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
frmAcercade acercade = new frmAcercade();
				
				
				dp.add(acercade);
				acercade.setClosable(true);
				acercade.setVisible(true);
				
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		
		
		
}
}
