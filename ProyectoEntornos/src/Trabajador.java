import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Trabajador extends JFrame {

	private JPanel Panel1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trabajador frame = new Trabajador();
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
	public Trabajador() {
		setTitle("CARREFOUR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 433);
		Panel1 = new JPanel();
		Panel1.setBackground(Color.WHITE);
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel1);
		Panel1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas v = new Ventas();
				v.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setToolTipText("Supermercado");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\Market.jpg"));
		btnNewButton.setBounds(91, 64, 169, 123);
		Panel1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setToolTipText("Consultar productos");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\checklist.png"));
		btnNewButton_1.setBounds(363, 64, 149, 129);
		Panel1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setToolTipText("Agregar producto");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\MasComida.jpg"));
		btnNewButton_2.setBounds(230, 242, 169, 91);
		Panel1.add(btnNewButton_2);
	}
}
