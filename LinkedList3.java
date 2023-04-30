/*
 * Java program to create Linked List by appending 30 & 70 to 56
 * - Node with data 56 is First Created
   - Next Append 30 to 56
   - Finally Append 70 to 30
   - LinkedList Sequence: 56->30->70
 * 
 */


package demo;

public class LinkedList3 {
	 Node head;

	// Defining a method to add a new node with data at the end of the linked list
	 public void append(int data) {
	     // Creating a new node with the given data
	     Node newNode = new Node(data);

	     // Checking if the linked list is empty
	     if (head == null) {
	         // If it's empty, making the new node the head of the list
	         head = newNode;
	         return;	
	     }

	     // Traversing the list until the end
	     Node current = head;
	     while (current.next != null) {
	         current = current.next;
	     }

	     // Adding the new node at the end of the list
	     current.next = newNode;
	 }

	 // Defining a method to print the linked list
	 public void printLinkedList() {
	     // Checking if the linked list is empty
	     if (head == null) {
	         // If it's empty, printing a message indicating that
	         System.out.print("LinkedList is empty");
	     } else {
	         // If it's not empty, traversing the list and print each node's data
	         Node temp = head;
	         while (temp != null) {
	             System.out.print(temp.data + " -> ");
	             temp = temp.next;
	         }
	     }
	 }
}
