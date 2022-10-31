
public class MenuTester {
	private static String getCurrentWorkingDirectory(String path) {
        String userDirectory = System.getProperty("user.dir");
        return userDirectory + path;
    }
	//String projectPath = getCurrentWorkingDirectory();
	
	//String dataPath = this.projectPath + "/data/accounts.csv";
	public static void main(String[] args){
		
		MenuRandomize randomize = new MenuRandomize(getCurrentWorkingDirectory("\\src\\data\\entrees.txt"),
				getCurrentWorkingDirectory("\\src\\data\\sides.txt"),getCurrentWorkingDirectory("\\src\\data\\salads.txt"),
				getCurrentWorkingDirectory("\\src\\data\\desserts.txt"));
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories"+
							myMenu.totalCalories());
	}
}
