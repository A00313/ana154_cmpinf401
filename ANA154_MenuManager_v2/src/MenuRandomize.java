import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize
 * 
 * @author : Ammar Alabboodi
 * @created: 10/31/2022
 */
public class MenuRandomize {
	ArrayList<Entree> entrees;
	ArrayList<Side> sides;
	ArrayList<Salad> salads;
	ArrayList<Dessert> desserts;

	/**
	 * This is a constructor that takes in 4 files, reads and parses them, then
	 * setting them to their respective declared variables Method MenuRandomize
	 * 
	 * @param entreesFile  a file with listed entrees
	 * @param sidesFile    a file with listed sides
	 * @param saladsFile   a file with listed salads
	 * @param dessertsFile a file with listed desserts
	 */

	public MenuRandomize(String entreesFile, String sidesFile, String saladsFile, String dessertsFile) {
		entrees = FileManager.readEntrees(entreesFile);
		sides = FileManager.readSides(sidesFile);
		salads = FileManager.readSalads(saladsFile);
		desserts = FileManager.readDesserts(dessertsFile);
	}

	/**
	 * This method creates a Menu randomly chosen from the lists of entrees, side,
	 * salads, and desserts set by the above constructor Method randomMenu
	 * 
	 * @return returnMenu returns the randomized menu
	 */
	public Menu randomMenu() {
		Random rand = new Random();
		int entreeInteger = rand.nextInt(0, entrees.size());
		Entree randEntree = entrees.get(entreeInteger);

		int sidesInteger = rand.nextInt(0, sides.size());
		Side randSides = sides.get(sidesInteger);

		int saladsInteger = rand.nextInt(0, entrees.size());
		Salad randSalads = salads.get(saladsInteger);

		int dessertsInteger = rand.nextInt(0, entrees.size());
		Dessert randDesserts = desserts.get(dessertsInteger);

		Menu returnMenu = new Menu("Random Menu", randEntree, randSides, randSalads, randDesserts);
		return returnMenu;

	}
}
