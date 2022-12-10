import java.util.ArrayList;
import java.util.Random;

/**
 * This class adds functionality to Menu objects
 * 
 * Class MenuManager
 * 
 * @author : Ammar Alabboodi
 * @created: 11/27/2022
 */
public class MenuManager {
	private ArrayList<Entree> entreeList = new ArrayList<Entree>();
	private ArrayList<Side> sideList = new ArrayList<Side>();
	private ArrayList<Salad> saladList = new ArrayList<Salad>();
	private ArrayList<Dessert> dessertList = new ArrayList<Dessert>();

	/**
	 * MenuManager
	 * @param dishesFile, the path to the file containing the dishes data
	 */
	MenuManager(String dishesFile){
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		menuItemList = FileManager.readItems(dishesFile);
		for (MenuItem item:menuItemList) {
			if (item instanceof Entree) {
				entreeList.add((Entree) item);
			}
			if (item instanceof Side) {
				sideList.add((Side) item);
			}
			if (item instanceof Salad) {
				saladList.add((Salad) item);
			}
			if (item instanceof Dessert) {
				dessertList.add((Dessert) item);
			}
		}
	}

	/**
	 * randomMenu
	 * @param name, the name of the randomly created menu
	 * @return returns a randomly generated random menu
	 */
	public Menu randomMenu(String name) {
		Random rand = new Random();
		int entreeInteger = rand.nextInt(0, entreeList.size());
		Entree randEntree = entreeList.get(entreeInteger);

		int sidesInteger = rand.nextInt(0, sideList.size());
		Side randSides = sideList.get(sidesInteger);

		int saladsInteger = rand.nextInt(0, saladList.size());
		Salad randSalads = saladList.get(saladsInteger);

		int dessertsInteger = rand.nextInt(0, dessertList.size());
		Dessert randDesserts = dessertList.get(dessertsInteger);

		Menu returnMenu = new Menu(name, randEntree, randSides, randSalads, randDesserts);
		return returnMenu;
	}

	/**
	 * minCaloriesMenu
	 * @param name, name given to the minimum total calories menu
	 * @return a menu with the lowest total calories
	 */
	public Menu minCaloriesMenu(String name) {
		Entree minEntree = entreeList.get(0);
		for (int i = 0; i < entreeList.size(); i++) {
			if (minEntree.getCalories() > entreeList.get(i).getCalories()) {
				minEntree = entreeList.get(i);
			}
		}
		Side minSide = sideList.get(0);
		for (int i = 0; i < sideList.size(); i++) {
			if (minSide.getCalories() > sideList.get(i).getCalories()) {
				minSide = sideList.get(i);
			}
		}
		Salad minSalad = saladList.get(0);
		for (int i = 0; i < saladList.size(); i++) {
			if (minSalad.getCalories() > saladList.get(i).getCalories()) {
				minSalad = saladList.get(i);
			}
		}
		Dessert minDessert = dessertList.get(0);
		for (int i = 0; i < dessertList.size(); i++) {
			if (minDessert.getCalories() > dessertList.get(i).getCalories()) {
				minDessert = dessertList.get(i);
			}
		}
		Menu tempMenu = new Menu(name, minEntree, minSide, minSalad, minDessert);
		return tempMenu;
	}
	
	/**
	 * maxCaloriesMenu
	 * @param name, name given to the maximum total calories menu
	 * @return a menu with the highest total calories
	 */
	public Menu maxCaloriesMenu(String name) {
		Entree maxEntree = entreeList.get(0);
		for (int i = 0; i < entreeList.size(); i++) {
			if (maxEntree.getCalories() < entreeList.get(i).getCalories()) {
				maxEntree = entreeList.get(i);
			}
		}
		Side maxSide = sideList.get(0);
		for (int i = 0; i < sideList.size(); i++) {
			if (maxSide.getCalories() < sideList.get(i).getCalories()) {
				maxSide = sideList.get(i);
			}
		}
		Salad maxSalad = saladList.get(0);
		for (int i = 0; i < saladList.size(); i++) {
			if (maxSalad.getCalories() < saladList.get(i).getCalories()) {
				maxSalad = saladList.get(i);
			}
		}
		Dessert maxDessert = dessertList.get(0);
		for (int i = 0; i < dessertList.size(); i++) {
			if (maxDessert.getCalories() < dessertList.get(i).getCalories()) {
				maxDessert = dessertList.get(i);
			}
		}
		Menu tempMenu = new Menu(name, maxEntree, maxSide, maxSalad, maxDessert);
		return tempMenu;
	}

	public ArrayList<Entree> getEntreeList() {
		return entreeList;
	}

	public void setEntreeList(ArrayList<Entree> entreeList) {
		this.entreeList = entreeList;
	}

	public ArrayList<Side> getSideList() {
		return sideList;
	}

	public void setSideList(ArrayList<Side> sideList) {
		this.sideList = sideList;
	}

	public ArrayList<Salad> getSaladList() {
		return saladList;
	}

	public void setSaladList(ArrayList<Salad> saladList) {
		this.saladList = saladList;
	}

	public ArrayList<Dessert> getDessertList() {
		return dessertList;
	}

	public void setDessertList(ArrayList<Dessert> dessertList) {
		this.dessertList = dessertList;
	}

}
