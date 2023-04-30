//Main method to delete 40 from linked list

package demo;

//Defining of Main9 class
public class Main9 {

	    public static void main(String[] args) {
	        LinkedList7 list = new LinkedList7();
	        
	        list.append(56);
	        list.append(30);
	        list.append(40);
	        list.append(70);
	        
	        // Searching LinkedList to find node with key value 40
	        Node node40 = list.search(40);
	        if (node40 == null) {
	            System.out.println("Node with value 40 not found");
	        } else {
	            // Deleting the node
	            list.delete(node40);
	            System.out.print("Updated Linked List: ");
	            list.printLinkedList();
	            // Showing the Linked List size is 3
	            System.out.println("Linked List size: " + list.size());
	        }
	    }
	}

