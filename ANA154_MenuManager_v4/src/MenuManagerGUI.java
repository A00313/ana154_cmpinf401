import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Choice;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuManagerGUI {

	private JFrame frame;
	DefaultListModel<String> menuStringList = new DefaultListModel<String>();
	public static ArrayList<Menu> menuList = new ArrayList<Menu>();
	MenuManager manager = new MenuManager(System.getProperty("user.dir") + "\\src\\data\\dishes.txt");
	JList list;
	public static String menuSelected = null;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerGUI window = new MenuManagerGUI();
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
	public MenuManagerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		
		frame = new JFrame("Menu Manager");
		frame.setBounds(350, 100, 850, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();

		ArrayList<Entree> entreeList = manager.getEntreeList();
			
		for (Entree entree:entreeList) {
			comboBox.addItem(entree.getName());
		}
		comboBox.setBounds(85, 81, 209, 21);
		frame.getContentPane().add(comboBox);
		
		
		JComboBox comboBox_1 = new JComboBox();
		ArrayList<Side> sideList = manager.getSideList();
		
		for (Side side:sideList) {
			comboBox_1.addItem(side.getName());
		}
		comboBox_1.setBounds(85, 130, 209, 21);
		frame.getContentPane().add(comboBox_1);
		
		
		JComboBox comboBox_2 = new JComboBox();
		ArrayList<Salad> saladList = manager.getSaladList();
				
				for (Salad salad:saladList) {
					comboBox_2.addItem(salad.getName());
				}
		comboBox_2.setBounds(85, 190, 209, 21);
		frame.getContentPane().add(comboBox_2);
		
		
		JComboBox comboBox_3 = new JComboBox();
		ArrayList<Dessert> dessertList = manager.getDessertList();
		
		for (Dessert dessert:dessertList) {
			comboBox_3.addItem(dessert.getName());
		}
		comboBox_3.setBounds(85, 239, 209, 21);
		frame.getContentPane().add(comboBox_3);
		
		
		JButton btnNewButton = new JButton("Create Menu with these dishes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entreeSelected = String.valueOf(comboBox.getSelectedItem());
				Entree entreeToAdd = null;
				for (Entree entree:entreeList) {
					if(entree.getName().equals(entreeSelected)) {
						entreeToAdd = entree;
					}
				}
				String sideSelected = String.valueOf(comboBox_1.getSelectedItem());
				Side sideToAdd = null;
				for (Side side:sideList) {
					if(side.getName().equals(sideSelected)) {
						sideToAdd = side;
					}
				}
				String saladSelected = String.valueOf(comboBox_2.getSelectedItem());
				Salad saladToAdd = null;
				for (Salad salad:saladList) {
					if(salad.getName().equals(saladSelected)) {
						saladToAdd = salad;
					}
				}
				String dessertSelected = String.valueOf(comboBox_3.getSelectedItem());
				Dessert dessertToAdd = null;
				for (Dessert dessert:dessertList) {
					if(dessert.getName().equals(dessertSelected)) {
						dessertToAdd = dessert;
					}
				}
				
				String menuName = JOptionPane.showInputDialog("Enter the name of your menu:");
				Menu menu = new Menu(menuName, entreeToAdd, sideToAdd, saladToAdd, dessertToAdd);
				menuList.add(menu);
				
				menuStringList.addElement(menuName);
				
			}
		});
		btnNewButton.setBounds(85, 313, 250, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Generate a Random Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String randomMenuName = JOptionPane.showInputDialog("Enter the name of your menu:");
				Menu randomMenu = manager.randomMenu(randomMenuName);
				menuList.add(randomMenu);
				menuStringList.addElement(randomMenu.getName());
			}
		});
		btnNewButton_1.setBounds(85, 408, 250, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Generate a Minimum calories Menu");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String minimumMenuName = JOptionPane.showInputDialog("Enter the name of your menu:");
				Menu minimumMenu = manager.minCaloriesMenu(minimumMenuName);
				menuList.add(minimumMenu);
				menuStringList.addElement(minimumMenu.getName());
			}
		});
		btnNewButton_1_1.setBounds(85, 453, 250, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Generate a Maximum calories Menu");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maximumMenuName = JOptionPane.showInputDialog("Enter the name of your menu:");
				Menu maximumMenu = manager.maxCaloriesMenu(maximumMenuName);
				menuList.add(maximumMenu);
				menuStringList.addElement(maximumMenu.getName());
			}
		});
		btnNewButton_1_1_1.setBounds(85, 505, 250, 21);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Entree");
		lblNewLabel.setBounds(22, 85, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Side");
		lblNewLabel_1.setBounds(22, 134, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salad");
		lblNewLabel_2.setBounds(22, 194, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dessert");
		lblNewLabel_3.setBounds(22, 243, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		JButton btnNewButton_2 = new JButton("Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						try {
//							DetailsFrame frame = new DetailsFrame();
//							frame.setVisible(true);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//					}
//				});
				if (list.getSelectedValue() != null) {
					menuSelected = list.getSelectedValue().toString();
				}
				if (menuSelected != null) {
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
				else {
					JOptionPane.showMessageDialog(null, "You haven't selected a Menu\nPlease select one to view its details");
				}
				
				
			}
		});
		btnNewButton_2.setBounds(433, 505, 110, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
		JButton btnNewButton_3 = new JButton("Delete All");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuList.clear();
				menuStringList.clear();
			}
		});
		btnNewButton_3.setBounds(562, 505, 110, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Save to Files");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenu(System.getProperty("user.dir") + "\\src\\data\\menus.txt", menuList);
			}
		});
		btnNewButton_4.setBounds(684, 505, 110, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		
		
		
		
		list = new JList(menuStringList);
		list.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		
		
		list.setBounds(433, 83, 350, 400);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_4 = new JLabel("Created menus");
		lblNewLabel_4.setBounds(562, 43, 90, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Create your own menu");
		lblNewLabel_5.setBounds(22, 44, 140, 20);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
