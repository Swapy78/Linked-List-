//Java program to insert 30 between 56 & 70

package demo;

//Defining a class called LinkedList4
public class LinkedList4 {
	// Declaring a variable of type Node, called head
	Node head; 
//Defining a method called append that takes an integer parameter called data
	public void append(int data) {
		// Creating a new Node with the given data
		Node newNode = new Node(data); 
		// If the head is null, making it the newNode and return
		if (head == null) { 
			head = newNode;
			return;
		}

		// Otherwise, traversing the list until we reach the end
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		// Adding the newNode to the end of the list
		current.next = newNode;
	}

//Defining a method called printLinkedList that prints the elements of the list
	public void printLinkedList() {
		// If the head is null, printing "LinkedList is empty"
		if (head == null) { 
			System.out.print("LinkedList is empty");
		} else { // Otherwise, traversing the list and print each element
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}

//Defining a method called pop that removes the first element from the list
	public void pop() {
// If the head is not null, removing it by setting head to its next element
		if (head != null) { 
			head = head.next;
		}
	}
}