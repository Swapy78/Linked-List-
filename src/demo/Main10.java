//Main method to create linked list in ascending order

package demo;
//Defining of the Main10 class
public class Main10 {
	
	// Main method
	public static void main(String[] args) {
		
		// Creating a new instance of SortedLinkedList with Integer type parameter
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();

		// Adding four integers to the sorted linked list in random order
		list.add(56);	     
		list.add(30);   
		list.add(40);    
		list.add(70);
	        
		// Printing the sorted linked list
		list.printLinkedList(); // Final Sequence: 30->40->56->70
	}

	}

