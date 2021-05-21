
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel PanelPrincipal;
	private JButton btnIniciosesion;
	private JButton btnReguistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal fra = new Principal();
					fra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 417);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 323, 356);
		PanelPrincipal.add(panel);
		panel.setLayout(null);
		
		btnIniciosesion = new JButton("Iniciar sesion");
		btnIniciosesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logeo l = new Logeo();
				l.setVisible(true);
				
			}
		});
		btnIniciosesion.setBounds(15, 292, 128, 36);
		panel.add(btnIniciosesion);
		
		btnReguistro = new JButton("Registrarse ");
		btnReguistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrarse r = new Registrarse();
				r.setVisible(true);
			}
		});
		btnReguistro.setBounds(183, 292, 128, 35);
		panel.add(btnReguistro);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\1DAM\\Porgramacion\\eclipse\\TrabajosEclipse\\ProyectoEntornos\\src\\Carrefour.jpg"));
		lblNewLabel.setBounds(15, 11, 300, 270);
		panel.add(lblNewLabel);
		
		
	}
}
