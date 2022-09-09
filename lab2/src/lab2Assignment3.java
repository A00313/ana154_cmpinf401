
import javax.swing.JOptionPane;

public class lab2Assignment3 {
	public static void main(String[] args) {
		String money = JOptionPane.showInputDialog("Input an amount of money in dollars between 1 and 9999");
		int moneyInt = Integer.parseInt(money);
		
		int grands = (int) Math.round(moneyInt / 1000);
		
		int benjamins = moneyInt % 1000;
		benjamins /= 100;
		
		int sawbucks = moneyInt%100;
		sawbucks /= 10;
		
		int bucks = moneyInt%10;

		
		JOptionPane.showMessageDialog(null, "Grands: " + grands +
				"\nBenjamins: " + benjamins +
				"\nSawbucks: " + sawbucks +
				"\nBucks: " + bucks);
		
	}

}
