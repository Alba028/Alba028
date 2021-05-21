import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrarse extends JFrame {

	private JPanel PanelRegistro;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
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
	public Registrarse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 322);
		PanelRegistro = new JPanel();
		PanelRegistro.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelRegistro);
		PanelRegistro.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				new ImageIcon("F:\\1DAM\\Porgramacion\\eclipse\\TrabajosEclipse\\ProyectoEntornos\\src\\Icono.png"));
		lblNewLabel.setBounds(20, 25, 79, 70);
		PanelRegistro.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(90, 38, 63, 14);
		PanelRegistro.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(138, 36, 123, 20);
		PanelRegistro.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(90, 67, 63, 14);
		PanelRegistro.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(148, 63, 113, 20);
		PanelRegistro.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(20, 106, 79, 14);
		PanelRegistro.add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(92, 106, 169, 20);
		PanelRegistro.add(passwordField);

		JLabel lblNewLabel_4 = new JLabel("Confir contrase\u00F1a");
		lblNewLabel_4.setToolTipText("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 131, 111, 25);
		PanelRegistro.add(lblNewLabel_4);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(124, 134, 137, 20);
		PanelRegistro.add(passwordField_1);

		JLabel lblNewLabel_5 = new JLabel("Tel\u00E9fono");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(20, 167, 63, 14);
		PanelRegistro.add(lblNewLabel_5);

		textField_2 = new JTextField();
		textField_2.setBounds(76, 165, 185, 20);
		PanelRegistro.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("E-mail");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(20, 199, 46, 14);
		PanelRegistro.add(lblNewLabel_6);

		textField_3 = new JTextField();
		textField_3.setBounds(67, 197, 194, 20);
		PanelRegistro.add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bienvenido a carrefour","INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
				Compra p = new Compra();
				p.setVisible(true);
				PanelRegistro.setVisible(false);
			}
		});
		btnNewButton.setBounds(20, 244, 99, 32);
		PanelRegistro.add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal();
				p.setVisible(true);
			}
		});
		btnCancelar.setBounds(148, 244, 99, 32);
		PanelRegistro.add(btnCancelar);
	}
}
