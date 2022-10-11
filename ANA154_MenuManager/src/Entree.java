
/**
 * class Entree
 * @author Ammar Alabboodi
 * created: 10/11/2022
 *
 */
public class Entree {
	
	private String name;
	private String discribtion;
	private int calories;
	
	public Entree(String n, String d, int c) {
		setName(n);
		setDiscribtion(d);
		setCalories(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscribtion() {
		return discribtion;
	}

	public void setDiscribtion(String discribtion) {
		this.discribtion = discribtion;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
}
