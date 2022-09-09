import javax.swing.JOptionPane;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("Type the length of the first side of the triangle: ");
		String num2 = JOptionPane.showInputDialog("Type the length of the second side of the triangle: ");

		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
		double hypotenuse = Math.sqrt(number2*number2 + number1*number1);
		 
		JOptionPane.showMessageDialog(null, "The hypotenuse of the triangle is " + hypotenuse);
	}

}
