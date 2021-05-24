import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.List;

public class Productos extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
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
	public Productos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 442);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Ver productos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(313, 86, 171, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\ojo.jpg"));
		lblNewLabel.setBounds(219, 86, 106, 51);
		contentPane.add(lblNewLabel);
		
		JButton btnAgregarProductos = new JButton("Agregar productos");
		btnAgregarProductos.setForeground(Color.BLACK);
		btnAgregarProductos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAgregarProductos.setBackground(Color.GRAY);
		btnAgregarProductos.setBounds(313, 186, 171, 51);
		contentPane.add(btnAgregarProductos);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\Mas.png"));
		lblNewLabel_1.setBounds(229, 170, 74, 77);
		contentPane.add(lblNewLabel_1);
		
		JButton btnEliminarProductos = new JButton("Eliminar productos");
		btnEliminarProductos.setForeground(Color.BLACK);
		btnEliminarProductos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminarProductos.setBackground(Color.GRAY);
		btnEliminarProductos.setBounds(313, 282, 171, 51);
		contentPane.add(btnEliminarProductos);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\Eliminar.jpg"));
		lblNewLabel_2.setBounds(229, 270, 74, 77);
		contentPane.add(lblNewLabel_2);
		
		List list = new List();
		list.setBounds(10, 60, 200, 319);
		contentPane.add(list);
	}
}
