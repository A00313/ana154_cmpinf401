import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Enter number to convert and units");
		
		String units = null;
		String numbers = null;
		if(input.indexOf(" ") > -1){
			units = input.substring(
					input.indexOf(" ")+1,input.length());
			numbers = input.substring(
					0,input.indexOf(" "));		
		}else{
			JOptionPane.showMessageDialog(null, "not a valid input! Make sure you enter the units");
			return;
		}
		double number = Double.parseDouble(numbers);
		if (units.equals("cm")) {
			
			number /= 2.54;
			JOptionPane.showMessageDialog(null, number + " in");
		}
		
		else if (units.equals("in")) {
			
			number *= 2.54;
			JOptionPane.showMessageDialog(null, number + " cm");
		}
		else if (units.equals("m")) {
			
			number /= 0.9144;
			JOptionPane.showMessageDialog(null, number + " yd");
		}

		else if (units.equals("yd")) {
			
			number *= 0.9144;
			JOptionPane.showMessageDialog(null, number + " m");
		}

		else if (units.equals("oz")) {
			
			number *= 28.35;
			JOptionPane.showMessageDialog(null, number + " gm");
		}

		else if (units.equals("gm")) {
			
			number /= 28.35;
			JOptionPane.showMessageDialog(null, number + " oz");
		}

		else if (units.equals("lb")) {
			
			number *= 0.45359237;
			JOptionPane.showMessageDialog(null, number + " kg");
		}

		else if (units.equals("kg")) {
			
			number /= 0.45359237;
			JOptionPane.showMessageDialog(null, number + " lb");
		}
		
	}
}
