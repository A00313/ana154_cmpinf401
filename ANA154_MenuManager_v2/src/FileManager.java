import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	public static ArrayList<Entree> readEntrees(String fileName){
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
				// return entreeList;
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return entreeList;
	}
	public static ArrayList<Side> readSides(String fileName){
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
					// return entreeList;
				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return sideList;
	}
	public static ArrayList<Salad> readSalads(String fileName){
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
				// return entreeList;
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return saladList;
	}
	public static ArrayList<Dessert> readDesserts(String fileName){
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
				// return entreeList;
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return dessertList;
	}
}
