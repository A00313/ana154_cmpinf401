import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class is simply used for it's static methods functionality
 * 
 * Class FileManager
 * 
 * @author : Ammar Alabboodi
 * @created: 11/27/2022
 */
public class FileManager {
	/**
	 * @param fileName, the file path that contains the dishes data
	 * @return it returns an Arraylist of type MenuItem which is the super class to all types of dishes 
	 */
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> menuItemList = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			try {
				while ((line = br.readLine()) != null) {
					String[] lineSplit = line.split("@@");
					if (lineSplit.length == 5) {
						String tempName = lineSplit[0];
						String tempDescribtion = lineSplit[2];
						String tempCalories = lineSplit[3];
						String tempPrice = lineSplit[4];
						
						int intCalories = Integer.parseInt(tempCalories);
						double doublePrice = Double.parseDouble(tempPrice);
						
						if (lineSplit[1].equals("entree")) {
							MenuItem tempMenuItem = new Entree(tempName, tempDescribtion, intCalories, doublePrice);
							menuItemList.add(tempMenuItem);
						}
						else if (lineSplit[1].equals("salad")) {
							MenuItem tempMenuItem = new Salad(tempName, tempDescribtion, intCalories, doublePrice);
							menuItemList.add(tempMenuItem);
						}
						else if (lineSplit[1].equals("side")) {
							MenuItem tempMenuItem = new Side(tempName, tempDescribtion, intCalories, doublePrice);
							menuItemList.add(tempMenuItem);
						}
						else if (lineSplit[1].equals("dessert")) {
							MenuItem tempMenuItem = new Dessert(tempName, tempDescribtion, intCalories, doublePrice);
							menuItemList.add(tempMenuItem);
						}
					}
				}
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return menuItemList;
	}
	
	/**
	 * @param fileName, the path to which the method will write to
	 * @param menus, the Arraylist of menus which the method will write the description of to the specified file
	 */
	public static void writeMenu( String fileName, ArrayList<Menu> menus ) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Menu tempMenu:menus) {
				bw.write(tempMenu.description());
			}
		    bw.close();
		    fw.close();		    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
