package lab4;

import javax.swing.JOptionPane;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberInput = JOptionPane.showInputDialog("Enter number to take the log (logarithm) of: ");
		String baseInput = JOptionPane.showInputDialog("Enter the base of whihc the logarithm will be caclulated: ");
		double number = Double.parseDouble(numberInput);
		double base = Double.parseDouble(baseInput);
		if (number <= 0 || base <= 1){
			JOptionPane.showMessageDialog(null, "Not a valid input! \nMake sure you enter a number that is greater than 0\n"
					+ "And a base that is greater than 1");
		}	
		else {
			
			double num = number;
			int solution = 0;
			while ((num)>=base) {
				num = num/base;
				solution++;
			}
			JOptionPane.showMessageDialog(null, "Calculating...\n" + solution);
		}
	}

}
