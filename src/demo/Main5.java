//Main method to delete first element in Linked List 56->30->70 

package demo;
//Defining the Main5 class
public class Main5 {
	
    // Defining the main function
    public static void main(String[] args) {
        
        // Creating a new LinkedList4 object
        LinkedList4 list = new LinkedList4();
        
        // Adding three nodes to the linked list
        list.append(56);
        list.append(30);
        list.append(70);
        
        // Printing the original linked list
        System.out.println("Original LinkedList:");
        list.printLinkedList();
        
        // Popping the head of the linked list
        list.pop();
        
        // Printing the updated linked list after popping the head
        System.out.println("\nLinkedList after popping the head:");
        list.printLinkedList();
    }
}
