
import javax.swing.JOptionPane;

public class lab2Assignment2 {
		public static void main(String[] args) {
			String radius = JOptionPane.showInputDialog("Enter the radius of a circle: ");
			double r = Double.parseDouble(radius);
			
			double perimeter = Math.PI * r * 2;
			double area = Math.PI * r * r;
			
			perimeter *= 100;
			perimeter = (int) Math.round(perimeter);
			perimeter /= 100;
			
			area *= 100;
			area = (int) Math.round(area);
			area /= 100;
			
			JOptionPane.showMessageDialog(null, "The circle of radius " + r + " has a parameter of " + perimeter + " and an area of " + area);
			
		}
}
