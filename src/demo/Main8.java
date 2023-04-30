//Main method to insert 40 after 30 in 56->30->70

package demo;

public class Main8 {
	
	// Main method
	public static void main(String[] args) {
		
		// Creating a new instance of LinkedList6
		LinkedList6 list = new LinkedList6();
	        
		// Appending three nodes to the linked list
		list.append(56);
		list.append(30);
		list.append(70);
	        
		// Searching the linked list to get the Node with key value 30
		Node node30 = list.search(30);
		
		// If node30 is null, it means that the node with value 30 is not found in the list
		if (node30 == null) {
			System.out.println("Node with value 30 not found");
		} 
		
		// If node30 is not null, it means that the node with value 30 is found in the list
		else {
			// Creating a new Node instance with value 40
			Node node40 = new Node(40);
			
			// Setting the next pointer of the new node to the next pointer of node30
			node40.next = node30.next;
			
			// Setting the next pointer of node30 to the new node
			node30.next = node40;
			
			// Printing the linked list after adding the new node
			list.printLinkedList();
		}
	}

	}


