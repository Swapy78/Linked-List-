/*
 * Java program for Main class and Main method for creation of linked list
 * by adding 30 & 56 to 70
 */

package demo;

public class Main2 {
	// Defining the main method
	public static void main(String[] args) {
		
		// Creating an instance of LinkedList2 class
	    LinkedList2 list = new LinkedList2();

	    // Creating nodes with data 70, 30, and 56
	    Node node70 = new Node(70);
	    Node node30 = new Node(30);
	    Node node56 = new Node(56);

	    // Adding nodes to linked list in correct sequence
	    node70.next = node30;
	    node30.next = node56;
	    
	    // Setting the head of the linked list as the first node
	    list.head = node70;

	    // Printing the linked list
	    Node current = list.head;
	    while (current != null) {
	    	// Printing the data of the current node
	        System.out.print(current.data + "->");
	        current = current.next;
	    }
	}
}
