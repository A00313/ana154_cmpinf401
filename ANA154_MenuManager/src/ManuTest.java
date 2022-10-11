
/**
 * class MenuTest
 * @author Ammar Alabboodi
 * created: 10/11/2022
 *
 */
public class ManuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entree entree1 = new Entree("entree 1", "Chicken sandwich with with no pickles", 150);
		
		Entree entree2 = new Entree("entree 2", "Tuna sandwich with with pickles", 1650);
		Side side1 = new Side("Side 1", "Vegitable soup", 50);
		Salad salad1 = new Salad("Salad 1", "Tomato, lettace, and onions", 28);
		Salad salad2 = new Salad("Salad 2", "Pickles, lettace, and cucumber", 25);
		Dessert dessert1 = new Dessert("Desert 1", "This is a cheese cake", 190);
		
		Menu menu1 = new Menu("Menu 1", entree1, side1);
		Menu menu2 = new Menu("Menu 2", entree2, side1, salad1, dessert1);
		Menu menu3 = new Menu("Menu 3");
		
		System.out.println(menu1.name + "\n");
		System.out.println(menu1.totalCalories() + "\n");
		System.out.println(menu1.describtion() + "\n");
		
		System.out.println(menu2.name + "\n");
		System.out.println(menu2.totalCalories() + "\n");
		System.out.println(menu2.describtion() + "\n");	
		
		System.out.println(menu3.name + "\n");
		System.out.println(menu3.totalCalories() + "\n");
		System.out.println(menu3.describtion() + "\n");	
	}
}
