//Java program to delete 40 from linked list

package demo;
//Defining the LinkedList7 class
public class LinkedList7 {
	
// Declaring an instance variable of type Node representing the head of the linked list
    Node head; 

    // Appending a node to the end of the linked list
    void append(int key) {
    	// Creating a new node with the given key value
        Node newNode = new Node(key); 
    // If the linked list is empty, setting the head to the new node and return
        if (head == null) { 
            head = newNode;
            return;
        }
     // Otherwise, iterating over the linked list to find the last node
        Node last = head; 
        while (last.next != null) {
            last = last.next;
        }
     // Setting the next pointer of the last node to the new node
        last.next = newNode; 
    }

    // Searching the linked list for a node with the given key value
    Node search(int key) {
        Node current = head; // Starting at the head of the linked list
        while (current != null) { // Iterating over the linked list
 // If the current node's key value matches the given key, returning the node
            if (current.key == key) { 
                return current;
            }
         // Otherwise, moving on to the next node in the linked list
            current = current.next; 
        }
        return null; // If the key is not found, returning null
    }

    // Deleting the given node from the linked list
    void delete(Node node) {
// If the node to be deleted is the head, setting the head to the next node and return
        if (node == head) { 
            head = head.next;
            return;
        }
     // Otherwise, iterating over the linked list to find the previous node
        Node prev = head; 
        while (prev.next != null && prev.next != node) {
            prev = prev.next;
        }
        if (prev.next == null) { // If the node is not found, return
            return;
        }
// Otherwise, setting the next pointer of the previous node to the node after the one being deleted
        prev.next = prev.next.next; 
    }

    // Printing the linked list
    void printLinkedList() {
        Node current = head; // Starting at the head of the linked list
        while (current != null) { // Iterating over the linked list
        	// Printing the key value of each node
            System.out.print(current.key + " "); 
         // Moving on to the next node in the linked list
            current = current.next; 
        }
     // Printing a newline character at the end of the list
        System.out.println(); 
    }

    // Calculating and return the size of the linked list
    int size() {
        Node current = head; // Starting at the head of the linked list
        int count = 0; // Initializing a counter to zero
        while (current != null) { // Iterating over the linked list
        	// Incrementing the counter for each node in the linked list
            count++; 
         // Moving on to the next node in the linked list
            current = current.next; 
        }
        return count; // Returning the final count
    }
}
