import javax.swing.JOptionPane;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = JOptionPane.showInputDialog("please enter a number");
		int userInputNum = Integer.parseInt(userInput);
		
		if (userInputNum%2 == 0)
			System.out.println("even");
		else
			System.out.print("Odd");

	}

}
