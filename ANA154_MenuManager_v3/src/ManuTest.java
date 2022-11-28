import java.util.ArrayList;

/**
 * Class is meant to test the functinality of all other classes in this project
 * class MenuTest
 * @author Ammar Alabboodi
 * created: 11/27/2022
 *
 */

public class ManuTest {
	private static String getCurrentWorkingDirectory(String path) {
		String userDirectory = System.getProperty("user.dir");
		return userDirectory + path;
	}
	public static void main(String[] args) {
		MenuManager manager = new MenuManager(getCurrentWorkingDirectory("\\src\\data\\dishes.txt"));
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		// Testing the randomMenu method by adding menu to the menuList
		menuList.add(manager.randomMenu("Menu1"));
		menuList.add(manager.randomMenu("Menu2"));
		menuList.add(manager.randomMenu("Menu3"));
		menuList.add(manager.randomMenu("Menu4"));
		// Testing the minCaloriesMenu and maxCaloriesMenu methods by adding menu to the menuList
		menuList.add(manager.minCaloriesMenu("Menu5"));
		menuList.add(manager.maxCaloriesMenu("Menu6"));
		// Testing the writeMenu method
		FileManager.writeMenu(getCurrentWorkingDirectory("\\src\\data\\randomDishes.txt"), menuList);
	}
}
