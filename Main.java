//Java program to create Main class and Main method to create linked list
//UC1

package demo;

// Defining the Main class
public class Main {

// Defining the main method
public static void main(String[] args) {
	
	// Creating an instance of the LinkedList class
    LinkedList linkedList = new LinkedList();
    
    // Creating a head node and initialize it to null
    Node head = null;

    // Adding nodes to the linked list
    head = linkedList.addNode(56, head);
    head = linkedList.addNode(30, head);
    head = linkedList.addNode(70, head);

    // Printing the linked list
    linkedList.printLinkedList(head);
}

}
