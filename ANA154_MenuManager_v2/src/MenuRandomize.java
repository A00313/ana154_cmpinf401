import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	ArrayList<Entree> entrees;
	ArrayList<Side> sides;
	ArrayList<Salad> salads;
	ArrayList<Dessert> desserts;
	
	public MenuRandomize(String entreesFile, String sidesFile, String saladsFile, String dessertsFile) {
		entrees = FileManager.readEntrees(entreesFile);
		sides = FileManager.readSides(sidesFile);
		salads = FileManager.readSalads(saladsFile);
		desserts = FileManager.readDesserts(dessertsFile);
	}
	public Menu randomMenu() {
		Random rand = new Random();
		int entreeInteger = rand.nextInt(0,entrees.size());
		Entree randEntree = entrees.get(entreeInteger);
		
		int sidesInteger = rand.nextInt(0,sides.size());
		Side randSides = sides.get(sidesInteger);

		int saladsInteger = rand.nextInt(0,entrees.size());
		Salad randSalads = salads.get(saladsInteger);
		
		int dessertsInteger = rand.nextInt(0,entrees.size());
		Dessert randDesserts = desserts.get(dessertsInteger);
		
		Menu returnMenu = new Menu("Random Menu",randEntree, randSides, randSalads, randDesserts);
		return returnMenu;
		
		
	}
}
