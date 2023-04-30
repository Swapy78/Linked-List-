//Main method to insert 30 between 56 & 70

package demo;
//Defining a class named Main4
public class Main4 {
	
	// Defining the main method
	public static void main(String[] args) {
		
		// Creating a new linked list object named "list"
		LinkedList3 list = new LinkedList3();
		
		// Appending data to the linked list
		list.append(56);
		list.append(70);
		
		// Searching for a node with data equal to 56
		Node current = list.head;
		while (current != null && current.data != 56) {
			current = current.next;
		}
		
// If a node with data equal to 56 is found, inserting a new node with data 30 after it
		if (current != null) {
			Node newNode = new Node(30);
			newNode.next = current.next;
			current.next = newNode;
		}
		
		// Printing the final linked list
		list.printLinkedList();
	}
}