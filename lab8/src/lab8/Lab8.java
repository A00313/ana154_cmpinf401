package lab8;

public class Lab8 {
	public static void main(String[] args) {
		String input = "";
		RecordList list = new RecordList();
		
		do {
			// Get user input
			input = javax.swing.JOptionPane.showInputDialog("Please enter new record (name, time).\nHit cancel to quit.");
			
			if (input != null) {
				double time;
				String name;
				
				// Process user input
				try {
					String [] parts = input.split(",");
					name = parts[0].trim();
					String timeStr = parts[1].trim();
					time = Double.parseDouble(timeStr);
				} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
					javax.swing.JOptionPane.showMessageDialog(null, "Invalid input, please try again!");
					continue; // if input is invalid, restart the loop
				}
				
				// Add new record
				Record r = new Record(name, time);
				int result = list.add(r);
				// Print out a message if this is new best time
				if (result == 0) {
					javax.swing.JOptionPane.showMessageDialog(null, "Congratulations! " + name + " has the fastest time so far");
				}
				
				// You can uncomment this to print the list after each operation for debugging
				//list.print();
			}
		} while (input != null);
        
		
		
		
//		  RecordList recordList = new RecordList(); Record r1 = new Record("Bob",10.5);
//		  Record r2 = new Record("Ammar",12.4); Record r3 = new Record("Bill",14.0);
//		  Record r4 = new Record("Amy",13.0); System.out.println(recordList.add(r1));
//		  System.out.println(recordList.add(r2));
//		  System.out.println(recordList.add(r3));
//		  System.out.println(recordList.add(r4));
//		  
//		  recordList.print();
//		  
		  list.writeToFile("\\src\\data\\recordList.txt");
		 
		
		
		
		  input = javax.swing.JOptionPane.
		  showInputDialog("Enter the name of a participant to look up"); String name =
		  input.trim(); int result = list.indexOf(name); if (result == -1) {
		  javax.swing.JOptionPane.showMessageDialog(null,
		  "The participant was not found"); } else {
		  javax.swing.JOptionPane.showMessageDialog(null, name + "'s time was #" +
		  (result+1) + " overall"); }
		 

	}
}
