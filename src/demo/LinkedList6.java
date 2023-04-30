//Java program to delete the last element in Linked List 56->30->70
//Java program to find node with value 30(for UC7)
//Java program to insert 40 after 30 in 56->30->70

package demo;
//This is a class named LinkedList6
public class LinkedList6 {
	// Node named head
	    Node head;

	    // A method named append to add a new node to the end of the list
	    public void append(int data) {
	    	// Creating a new LinkedList6 object named list
	    	LinkedList6 list = new LinkedList6();
	        // Creating a new node with the provided data
	        Node newNode = new Node(data);
	        // Searching for the node with the data 30
	        Node node = list.search(30);

	        // If the list is empty, head will be the new node
	        if (head == null) {
	            head = newNode;
	            return;
	        }

// If the list is not empty, finding the last node and adding the new node to it
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

// A method named printLinkedList to print all the nodes in the list
	    public void printLinkedList() {
	        // If the list is empty, printing a message saying so
	        if (head == null) {
	            System.out.print("LinkedList is empty");
	        } else {
// If the list is not empty, printing all the nodes separated by "->".
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data + " -> ");
	                temp = temp.next;
	            }
	        }
	    }

	    // A method named search to search for a node with the provided key
	    public Node search(int key) {
// Starting from the head, go through each node until the node with the provided key is found
	        Node current = head;
	        while (current != null) {
	            if (current.data == key) {
	                return current;
	            }
	            current = current.next;
	        }
	        // If the key is not found, return null.
	        return null;
	    }
	}
