import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DetailsWindow {

	JFrame frame;
	public String menuSelected = MenuManagerGUI.menuSelected;
	public ArrayList<Menu> menuListCopyed = MenuManagerGUI.menuList;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetailsWindow window = new DetailsWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DetailsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		if (menuSelected != null) {
			frame = new JFrame(menuSelected);
		}
		else {
			frame = new JFrame();
		}
		frame = new JFrame();
		
		frame.setBounds(350, 200, 850, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
		
		// Headers
		JLabel lblNewLabel = new JLabel("Entree");
		lblNewLabel.setBounds(30, 67, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Side");
		lblNewLabel_1.setBounds(30, 131, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salad");
		lblNewLabel_2.setBounds(30, 199, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dessert");
		lblNewLabel_3.setBounds(30, 269, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Calories");
		lblNewLabel_4.setBounds(30, 346, 80, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total Price");
		lblNewLabel_5.setBounds(30, 386, 80, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		// Descriptions
		Menu selectedMenu = null;
		for (Menu menu:menuListCopyed) {
			if(menu.getName().equals(menuSelected)) {
				selectedMenu = menu;
			}
		}
		
		Entree entreeToDescribe = selectedMenu.getEntree();
		String entreeDescription = entreeToDescribe.getDiscribtion();
		
		JLabel lblNewLabel_6 = new JLabel("<html>" + entreeDescription + "</html>");
		//lblNewLabel_6.setText("<html>" + entreeDescription + "</html>");
		lblNewLabel_6.setBounds(134, 46, 650, 55);
		frame.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(Color.black));
		
		Side sideToDescribe = selectedMenu.getSide();
		String sideDescription = sideToDescribe.getDiscribtion();
		
		JLabel lblNewLabel_6_1 = new JLabel("<html>" + sideDescription + "</html>");
		lblNewLabel_6_1.setBounds(134, 110, 650, 55);
		frame.getContentPane().add(lblNewLabel_6_1);
		lblNewLabel_6_1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		Salad saladToDescribe = selectedMenu.getSalad();
		String saladDescription = saladToDescribe.getDiscribtion();
		
		JLabel lblNewLabel_6_1_1 = new JLabel("<html>" + saladDescription + "</html>");
		lblNewLabel_6_1_1.setBounds(134, 178, 650, 55);
		frame.getContentPane().add(lblNewLabel_6_1_1);
		lblNewLabel_6_1_1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		Dessert dessertToDescribe = selectedMenu.getDessert();
		String dessertDescription = dessertToDescribe.getDiscribtion();
		JLabel lblNewLabel_6_1_2 = new JLabel("<html>" + dessertDescription + "</html>");
		lblNewLabel_6_1_2.setBounds(134, 248, 650, 55);
		frame.getContentPane().add(lblNewLabel_6_1_2);
		lblNewLabel_6_1_2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		int totalCalories = selectedMenu.totalCalories();
		String totalCaloriesStr = Integer.toString(totalCalories);
		JLabel lblNewLabel_7 = new JLabel(totalCaloriesStr);
		lblNewLabel_7.setBounds(134, 340, 70, 25);
		frame.getContentPane().add(lblNewLabel_7);
		lblNewLabel_7.setBorder(BorderFactory.createLineBorder(Color.black));
		
		double totalPrice = selectedMenu.getPrice();
		String totalPriceStr = Double.toString(totalPrice);
		JLabel lblNewLabel_7_1 = new JLabel(totalPriceStr);
		lblNewLabel_7_1.setBounds(134, 380, 70, 25);
		frame.getContentPane().add(lblNewLabel_7_1);
		lblNewLabel_7_1.setBorder(BorderFactory.createLineBorder(Color.black));
	}

}
