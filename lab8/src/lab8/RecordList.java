package lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RecordList {
	/**
	 * The node class represents a single list element with a data item and
	 * reference to the next node in the list
	 */
	private class Node {
		// data held by this node
		Record data;
		// reference to the next node in the list, or null if there is no such node
		// (i.e. this is the last node in the list)
		Node next;

		/**
		 * Creates a node with the given data
		 * 
		 * @param dataValue data to hold in this node
		 */
		public Node(Record dataValue) {
			next = null;
			data = dataValue;
		}
	}

	private Node head;

	/**
	 * Initializes a linked list with a single "dummy" node (contains no real data)
	 * to simplify code for the case of an empty list
	 */
	public RecordList() {
		head = new Node(null);
	}

	/**
	 * Finds the index of the record with the given name in the list
	 * 
	 * @param name name to search for
	 * @return index of name in list if found, -1 otherwise
	 */
	public int indexOf(String name) {
		Node currentNode = head;
		int index = 0;

		// traverse through the list looking for our target node
		while (currentNode.next != null && !currentNode.next.data.getName().equals(name)) {
			currentNode = currentNode.next;
			index++;
		}

		// we got to the end of the list without finding our target
		if (currentNode.next == null)
			return -1;
		else
			return index;
	}

	/**
	 * Adds the given item to the list, sorted by time (lowest to highest)
	 * 
	 * @param data data to add
	 * @return the index the data was inserted at
	 */
	public int add(Record data) {
		// Replace this with your own code. You can use the indexOf() method as a guide.
		Node currentNode = head;
		int index = 0;
		Node temp = new Node(data);

		if (head.next == null) {
			head.next = temp;
			return index;
		}
		// traverse through the list looking for our target node
		while (currentNode.next != null && currentNode.next.data.getTime() < temp.data.getTime()) {
			currentNode = currentNode.next;
			index++;
		}
		temp.next = currentNode.next;
		currentNode.next = temp;
		// currentNode.next.setNext(currentNode);

		// we got to the end of the list without finding our target
		if (currentNode.next == null)
			return -1;
		else
			return index;
	}

	/**
	 * Prints out each record in the list, one per line
	 */
	public void print() {
		// note that we start from our first *real* node in this case (head.next, not
		// our dummy head)
		Node currentNode = head.next;
		while (currentNode != null) {
			System.out.println(currentNode.data.getName() + ", " + currentNode.data.getTime());
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	/**
	 * Write out the contents of the linked list to the given file, one entry per
	 * line
	 * 
	 * @param filename name of the file to write the list to
	 */
	public void writeToFile(String filename) {
		Node currentNode = head.next;
		String userDirectory = System.getProperty("user.dir");
		try {
			FileWriter fw = new FileWriter(userDirectory + filename);
			BufferedWriter bw = new BufferedWriter(fw);

			while (!(currentNode == null)) {
				bw.append(currentNode.data.getName());
				bw.append(",");
				bw.append(String.valueOf(currentNode.data.getTime()));
				bw.append("\n");
				currentNode = currentNode.next;
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
