
/**
 * class Menu
 * @author Ammar Alabboodi
 * created: 11/27/2022
 *
 */
public class Menu {
	String name;
	Entree entree;
	Side side;	
	Salad salad;
	Dessert dessert;

	public Menu(String name1) {
		name = name1;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}

	public Menu(String name1, Entree entree1, Side side1) {
		name = name1;
		entree = entree1;
		side = side1;
		salad = null;
		dessert = null;
	}

	public Menu(String name1, Entree entree1, Side side1, Salad salad1, Dessert dessert1) {
		name = name1;
		entree = entree1;
		side = side1;
		salad = salad1;
		dessert = dessert1;
	}

	/**
	 * @return returns an integer that represents the total calories of the menu
	 */
	public int totalCalories() {
		int totalCalories;
		if (entree == null && side == null) {
			totalCalories = 0;
		}
		else if (salad == null || dessert == null) {
			totalCalories = entree.getCalories() + side.getCalories();
		}
		else {
			totalCalories = entree.getCalories() + side.getCalories() + salad.getCalories() + dessert.getCalories();
		}
		return totalCalories;
	}

	/**
	 * @return it returns a string of the detailed description of the menu
	 */
	public String description() {
		String print;
		if (entree == null && side == null) {
			print = (	
					"Entree: N/A\n" +
							"Side: N/A\n" +
							"Salad: N/A\n" +
							"Dessert: N/A\n"
					);
		}
		else if (salad == null && dessert == null) {
			print = (	
					name + "\n" +
							"Entree: " + entree.getName() + " | Describtion: " + entree.getDiscribtion() + " | Calories: " + entree.getCalories() + " | Price: " + entree.getPrice() + "\n" +
							"Side: " + side.getName() + " | Describtion: " + side.getDiscribtion() + " | Calories: " + side.getCalories() + " | Price: " + side.getPrice() + "\n" +
							"Total Calories of Menu: " + totalCalories() + "\n" +
							"Total Price of Menu: " + (entree.getPrice() + side.getPrice()) + "\n"
					);
		}
		else {
			print = (
					name + "\n" +
					"Entree: " + entree.getName() + " | Describtion: " + entree.getDiscribtion() + " | Calories: " + entree.getCalories() + " | Price: " + entree.getPrice() + "\n" +
					"Side: " + side.getName() + " | Describtion: " + side.getDiscribtion() + " | Calories: " + side.getCalories() + " | Price: " + side.getPrice() + "\n" +
					"Salad: " + salad.getName() + " | Describtion: " + salad.getDiscribtion() + " | Calories: " + salad.getCalories() + " | Price: " + salad.getPrice() + "\n" +
					"Dessert: "+ dessert.getName() + " | Describtion: " + dessert.getDiscribtion() + " | Calories: " + dessert.getCalories() + " | Price: " + dessert.getPrice() + "\n" +
					"Total Calories of Menu: " + totalCalories() + "\n" +
					"Total Price of Menu: " + (entree.getPrice() + side.getPrice() + salad.getPrice() + dessert.getPrice()) + "\n\n"
					);
		}
		return print;
	}

	// getter and setter
	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString(){
		return "The name of this menu is: " + name;
	}
}
