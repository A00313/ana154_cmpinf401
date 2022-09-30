package lab5;

import java.util.Random;

import javax.swing.JOptionPane;

public class MainProgram {
	public static void RollDice (int x, Random r) {

		double x2 = 0;
		double x3 = 0;
		double x4 = 0;
		double x5 = 0;
		double x6 = 0;
		double x7 = 0;
		double x8 = 0;
		double x9 = 0;
		double x10 = 0;
		double x11 = 0;
		double x12 = 0;

		
		
		for (int i = 0; i < x;i++) {
			int roll = r.nextInt(1, 7) + r.nextInt(1, 7);
			if(roll == 2) {
			x2++;
			}
			else if (roll == 3) {
				x3++;
			}
			else if (roll == 4) {
				x4++;
			}
			else if (roll == 5) {
				x5++;
			}
			else if (roll == 6) {
				x6++;
			}
			else if (roll == 7) {
				x7++;
			}
			else if (roll == 8) {
				x8++;
			}
			else if (roll == 9) {
				x9++;
			}
			else if (roll == 10) {
				x10++;
			}
			else if (roll == 11) {
				x11++;
			}
			else if (roll == 12) {
				x12++;
			}
		}
		JOptionPane.showMessageDialog(null, "Dice rolles Value repeatiton and Fractions:\n"
				+ "    Values                           Fractions\n"
				+ "2:    " + Math.round(x2) + "                              " + Math.round((x2/x)*36) + "/36\n"
				+ "3:    " + Math.round(x3) + "                              " + Math.round((x3/x)*36) + "/36\n"
				+ "4:    " + Math.round(x4) + "                              " + Math.round((x4/x)*36) + "/36\n"
				+ "5:    " + Math.round(x5) + "                              " + Math.round((x5/x)*36) + "/36\n"
				+ "6:    " + Math.round(x6) + "                              " + Math.round((x6/x)*36) + "/36\n"
				+ "7:    " + Math.round(x7) + "                              " + Math.round((x7/x)*36) + "/36\n"
				+ "8:    " + Math.round(x8) + "                              " + Math.round((x8/x)*36) + "/36\n"
				+ "9:    " + Math.round(x9) + "                              " + Math.round((x9/x)*36) + "/36\n"
				+ "10:    " + Math.round(x10) + "                             " + Math.round((x10/x)*36) + "/36\n"
				+ "11:    " + Math.round(x11) + "                             " + Math.round((x11/x)*36) + "/36\n"
				+ "12:    " + Math.round(x12) + "                             " + Math.round((x12/x)*36) + "/36"
				);
	}

	public static void main(String[] args) {
		boolean quit = false;
		Random rand = new Random();
		
		while (quit == false) {
			String rollTimesInput = JOptionPane.showInputDialog("please input the number of times you want the two dice to roll: ");
			int rollTimes = Integer.parseInt(rollTimesInput);
			RollDice(rollTimes, rand);
			
			String quitInput = JOptionPane.showInputDialog("If you want to roll dice again type in yes to keep playing or no to quit:");
			if (quitInput.equals("no")) {
				quit = true;
				return;
			}
			while (!(quitInput.equals("yes"))) {
				quitInput = JOptionPane.showInputDialog("please enter \"yes\" or \"no\"");
				if (quitInput.equals("yes")) {
					quit = false;
				}
				if (quitInput.equals("no")) {
					quit = true;
					return;
				}
			}
		}
	}
}
