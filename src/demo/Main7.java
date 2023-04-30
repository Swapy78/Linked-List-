//Main method to find node with value 30

package demo;
//Main class for testing the LinkedList6 class
public class Main7 {
	
	// Main method
	public static void main(String[] args) {
		// Creating a new instance of LinkedList6
		LinkedList6 list = new LinkedList6();
		
		// Appending some nodes to the linked list
		list.append(56);
		list.append(30);
		list.append(70);
		
		// Searching for a node with a value of 30 in the linked list
		Node result = list.search(30);
		// If the node is not found, print a message indicating so
		if (result == null) {
		    System.out.println("Node with value 30 not found");
		} else {
		// If the node is found, print a message indicating so
		    System.out.println("Node with value 30 found");
		}
	}


}
