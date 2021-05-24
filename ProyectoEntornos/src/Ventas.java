import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import java.awt.List;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Ventas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas frame = new Ventas();
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
	public Ventas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 628);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ventas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBounds(347, 112, 219, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\logo.png"));
		lblNewLabel_1.setBounds(10, 11, 370, 103);
		contentPane.add(lblNewLabel_1);
		
		Panel panel1 = new Panel();
		panel1.setForeground(new Color(255, 255, 255));
		panel1.setFont(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(10, 162, 859, 409);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("ID del producto");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(32, 140, 135, 20);
		panel1.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setBounds(161, 142, 103, 20);
		panel1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Cantidad");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(32, 171, 79, 20);
		panel1.add(lblNewLabel_3_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(121, 171, 41, 25);
		panel1.add(spinner);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"IDproducto", "Nombre", "Cantidad", "Precio"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(10, 202, 825, 207);
		panel1.add(table);
		
		List list = new List();
		list.setBounds(334, 10, 485, 181);
		panel1.add(list);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Tecnolog\u00EDa");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_2.setBounds(32, 27, 135, 20);
		panel1.add(lblNewLabel_3_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tel\u00E9fonos", "Televisores", "Ordenadores", "Altavoces"}));
		comboBox.setBounds(121, 27, 103, 22);
		panel1.add(comboBox);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Comida");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_3.setBounds(32, 88, 72, 20);
		panel1.add(lblNewLabel_3_1_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ropa de bebe", "Ropa de nino/a", "Abrigos", "Ropa deportiva", "Zapatos"}));
		comboBox_1.setBounds(121, 58, 103, 22);
		panel1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Bebidas", "Productos frescos", "Pescaderia", "Carniceria", "Bolleria/galletas"}));
		comboBox_2.setBounds(121, 89, 103, 22);
		panel1.add(comboBox_2);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel("Ropa");
		lblNewLabel_3_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_3_1.setBounds(32, 58, 72, 20);
		panel1.add(lblNewLabel_3_1_3_1);
	}
}
