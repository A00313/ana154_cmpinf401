
/**
 * Class MenuTester
 * 
 * @author : Ammar Alabboodi
 * @created: 10/31/2022
 */
public class MenuTester {
	/**
	 * Method getCurrentWOrkingDirectory
	 * 
	 * @param path a string of a file of which the full path is returned
	 * @return String containg the full path to the file
	 */
	private static String getCurrentWorkingDirectory(String path) {
		String userDirectory = System.getProperty("user.dir");
		return userDirectory + path;
	}

	/**
	 * Method getCurrentWOrkingDirectory
	 * 
	 * @param args a list of strings
	 */
	public static void main(String[] args) {

		MenuRandomize randomize = new MenuRandomize(getCurrentWorkingDirectory("\\src\\data\\entrees.txt"),
				getCurrentWorkingDirectory("\\src\\data\\sides.txt"),
				getCurrentWorkingDirectory("\\src\\data\\salads.txt"),
				getCurrentWorkingDirectory("\\src\\data\\desserts.txt"));
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description() + "\nTotal calories" + myMenu.totalCalories());
	}
}
