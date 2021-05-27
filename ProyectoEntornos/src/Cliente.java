import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame {

	private JPanel Panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 396);
		Panel = new JPanel();
		Panel.setBackground(Color.WHITE);
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		Panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas v = new Ventas();
				v.setVisible(true);
			}
		});
		btnNewButton.setToolTipText("Supermercado");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\Market.jpg"));
		btnNewButton.setBounds(76, 98, 155, 113);
		Panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("Consultar productos");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\34673\\git\\Alba028\\ProyectoEntornos\\src\\checklist.png"));
		btnNewButton_1.setBounds(326, 101, 146, 110);
		Panel.add(btnNewButton_1);
	}

}
