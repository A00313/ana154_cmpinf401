import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class is simply used for it's static methods functionality which is
 * reading a given file, parsing it, and returning a list of type entree, salad,
 * side, or dessert
 * 
 * Class FileManager
 * 
 * @author : Ammar Alabboodi
 * @created: 11/27/2022
 */
public class FileManager {
	/**
	 * Method readEntrees
	 * 
	 * @param fileName a string of a file which the method will parse from
	 * @return the ArrayList of type Entree
	 */
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entreeList = new ArrayList<>();
		try {

			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			try {
				while ((line = br.readLine()) != null) {
					String[] lineSplit = line.split("@@");
					if (lineSplit.length == 3) {
						String tempName = lineSplit[0];
						String tempDescribtion = lineSplit[1];
						String tempCalories = lineSplit[2];
						int doubleCalories = Integer.parseInt(tempCalories);
						Entree tempEntree = new Entree(tempName, tempDescribtion, doubleCalories);
						entreeList.add(tempEntree);
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
		return entreeList;
	}

	/**
	 * Method readSides
	 * 
	 * @param fileName a string of a file which the method will parse from
	 * @return the ArrayList of type Side
	 */
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sideList = new ArrayList<>();
		try {

			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			try {
				while ((line = br.readLine()) != null) {
					String[] lineSplit = line.split("@@");
					if (lineSplit.length == 3) {
						String tempName = lineSplit[0];
						String tempDescribtion = lineSplit[1];
						String tempCalories = lineSplit[2];
						int doubleCalories = Integer.parseInt(tempCalories);
						Side tempSide = new Side(tempName, tempDescribtion, doubleCalories);
						sideList.add(tempSide);
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
		return sideList;
	}

	/**
	 * Method readSalads
	 * 
	 * @param fileName a string of a file which the method will parse from
	 * @return the ArrayList of type Salad
	 */
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> saladList = new ArrayList<>();
		try {

			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			try {
				while ((line = br.readLine()) != null) {
					String[] lineSplit = line.split("@@");
					if (lineSplit.length == 3) {
						String tempName = lineSplit[0];
						String tempDescribtion = lineSplit[1];
						String tempCalories = lineSplit[2];
						int doubleCalories = Integer.parseInt(tempCalories);
						Salad tempSalad = new Salad(tempName, tempDescribtion, doubleCalories);
						saladList.add(tempSalad);
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
		return saladList;
	}

	/**
	 * Method readDesserts
	 * 
	 * @param fileName a string of a file which the method will parse from
	 * @return the ArrayList of type Dessert
	 */
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> dessertList = new ArrayList<>();
		try {

			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			try {
				while ((line = br.readLine()) != null) {
					String[] lineSplit = line.split("@@");
					if (lineSplit.length == 3) {
						String tempName = lineSplit[0];
						String tempDescribtion = lineSplit[1];
						String tempCalories = lineSplit[2];
						int doubleCalories = Integer.parseInt(tempCalories);
						Dessert tempDessert = new Dessert(tempName, tempDescribtion, doubleCalories);
						dessertList.add(tempDessert);
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
		return dessertList;
	}
}
