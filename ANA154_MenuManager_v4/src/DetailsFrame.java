import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class DetailsFrame extends JFrame {

	private JPanel contentPane;
	
	public String menuSelected = MenuManagerGUI.menuSelected;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//	}

	/**
	 * Create the frame.
	 */
	public DetailsFrame() {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 850, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entree");
		lblNewLabel.setBounds(30, 46, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Side");
		lblNewLabel_1.setBounds(30, 98, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salad");
		lblNewLabel_2.setBounds(30, 157, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dessert");
		lblNewLabel_3.setBounds(30, 209, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Calories");
		lblNewLabel_4.setBounds(30, 291, 80, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total Price");
		lblNewLabel_5.setBounds(30, 327, 80, 13);
		contentPane.add(lblNewLabel_5);
	}
}
