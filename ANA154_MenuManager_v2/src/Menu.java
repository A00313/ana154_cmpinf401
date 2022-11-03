
/**
 * class Menu
 * @author Ammar Alabboodi
 * created: 10/11/2022
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

	public int totalCalories() {
		int totalCalories;
		if (entree == null && side == null) {
			totalCalories = 0;
		}
		else if (salad == null) {
			totalCalories = entree.getCalories() + side.getCalories();
		}
		else {
			totalCalories = entree.getCalories() + side.getCalories() + salad.getCalories() + dessert.getCalories();
		}
		return totalCalories;
	}

	public String description() {
		String print;
		if (entree == null) {
			print = (	
					"Entree: N/A\n" +
							"Side: N/A\n" +
							"Salad: N/A\n" +
							"Dessert: N/A\n"
					);
		}
		else if (dessert == null & salad == null) {
			print = (	
					"Entree: " + entree.getDiscribtion() + "\n" +
							"Side: " + side.getDiscribtion() + "\n" +
							"Salad: N/A\n" +
							"Dessert: N/A\n"
					);
		}
		else {
			print = (
					"Entree: " + entree.getDiscribtion() + "\n" +
							"Side: " + side.getDiscribtion() + "\n" +
							"Salad: " + salad.getDiscribtion() + "\n" +
							"Dessert: " + dessert.getDiscribtion() + "\n"
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
}
