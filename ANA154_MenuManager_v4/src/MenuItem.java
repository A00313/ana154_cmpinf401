
/**
 * @author Ammar Alabboodi
 * @created: 11/27/2022
 */
public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;
	
	public MenuItem(String name, String description, int calories, double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}
	
	// Accessors / Mutators	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscribtion() {
		return description;
	}

	public void setDiscribtion(String discribtion) {
		this.description = discribtion;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString(){
		return "This items name is: " + name;
	}
}
