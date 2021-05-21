import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Compra extends JFrame {

	private JPanel PanelCompra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compra fram = new Compra();
					fram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Compra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 211);
		PanelCompra = new JPanel();
		PanelCompra.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelCompra);
		PanelCompra.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Comprar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(178, 34, 89, 25);
		PanelCompra.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ROPA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(32, 104, 107, 35);
		PanelCompra.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TECNOLOGIA");
		btnNewButton_1.setBounds(164, 104, 115, 35);
		PanelCompra.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("COMIDA");
		btnNewButton_2.setBounds(313, 104, 96, 35);
		PanelCompra.add(btnNewButton_2);
	}

}
