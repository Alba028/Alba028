import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logeo extends JFrame {

	private JPanel PanelLogeo;
	private JTextField txtUsuario;
	private JPasswordField jpassclave;
	private JButton btnIngresar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 228);
		PanelLogeo = new JPanel();
		PanelLogeo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelLogeo);
		PanelLogeo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(174, 22, 117, 24);
		PanelLogeo.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(23, 61, 59, 34);
		PanelLogeo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(216, 71, 97, 14);
		PanelLogeo.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(92, 68, 97, 24);
		PanelLogeo.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassclave = new JPasswordField();
		jpassclave.setBounds(313, 68, 109, 24);
		PanelLogeo.add(jpassclave);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave = jpassclave.getPassword();
				String claveFinal = new String(clave);
				
				if(txtUsuario.getText().equals("Alba") && claveFinal.equals("1234")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido a carrefour","INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
					Compra p = new Compra();
					p.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos","ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnIngresar.setBounds(102, 121, 97, 34);
		PanelLogeo.add(btnIngresar);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal();
				p.setVisible(true);
				PanelLogeo.setVisible(false);
			}
		});
		btnNewButton.setBounds(241, 122, 97, 32);
		PanelLogeo.add(btnNewButton);
	}
}
