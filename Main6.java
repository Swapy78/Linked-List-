//Main method to delete last element of 56->30->70

package demo;
//Defining the Main6 class
public class Main6 {
	
	// Defining the main method
	public static void main(String[] args) {
		// Creating a new instance of the LinkedList5 class
		LinkedList5 list = new LinkedList5();
		
		// Appending three nodes with values 56, 30, and 70 to the list
		list.append(56);
		list.append(30);
		list.append(70);
		
		// Printing the original linked list
		System.out.println("Original LinkedList:");
		list.printLinkedList();
		
		// Removing the last element from the linked list
		list.popLast();
		
		// Printing the updated linked list
		System.out.println("\nLinkedList after popping the last element:");
		list.printLinkedList();
	}

	}


