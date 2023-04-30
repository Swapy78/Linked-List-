/*
 * Java program to create Linked List by adding 30 & 56 to 70
 * - Node with data 70 is First Created
   - Next 30 is added to 70
   - Finally 56 is added to 30
 */

package demo;

//Defining the LinkedList class
public class LinkedList2 {

	// Defining the head node of the linked list
	public Node head;

	// Defining the add method to add a new node to the end of the linked list
	public void add(int data) {
		
		// Creating a new node with the given data
	    Node newNode = new Node(data);
	    
	    // If the linked list is empty, setting the head node to the new node
	    if (head == null) {
	        head = newNode;
	    } else {
	    	
	    	// Traversing the linked list to find the last node
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        
	        // Setting the next pointer of the last node to the new node
	        current.next = newNode;
	    }
	}
}


 
