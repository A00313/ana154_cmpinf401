package lab7;

import javax.swing.JOptionPane;
import java.util.Random;

public class Lab7 {

	public static double max(double[] data) {

		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	public static double min(double[] data) {

		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	public static double sum(double[] data) {

		double sum = 0;
		for (double number : data) {
			sum += number;
		}
		return sum;
	}

	public static double ave(double[] data) {

		double ave = sum(data) / data.length;
		return ave;
	}

	public static void main(String[] args) {
		Random r = new Random();

		String input = JOptionPane.showInputDialog("How many items do you want: ");
		int intInput = Integer.parseInt(input);
		double[] numbers = new double[intInput];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextDouble(0, 10);
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		JOptionPane.showMessageDialog(null,
				"The maximum value in the array: " + max(numbers) + "\n" + 
				"The minimum value in the array: " + min(numbers) + "\n" + 
				"The sum of the values in the array: " + sum(numbers) + "\n" + 
				"The average of the values in the array: " + ave(numbers) + "\n");
	}

}
