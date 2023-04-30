//Java program to create a simple linked list of 56,30,70

package demo;

// Class to represent a LinkedList
public class LinkedList {

	// Method to add a new node with the given data to the LinkedList
	public Node addNode(int data, Node head) {

        // Creating a new Node with the given data
        Node newNode = new Node(data);

        // If the LinkedList is empty, making the new Node the head of the LinkedList
        if (head == null) {
            head = newNode;

        } else {
            // Traversing the LinkedList to find the last Node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            // Setting the next reference of the last Node to the new Node
            temp.next = newNode;
        }
        
        // Returning the head of the LinkedList
        return head;
    }
   
    // Method to print the LinkedList
    public void printLinkedList(Node head) {
        // If the LinkedList is empty, printing a message
        if(head == null) {
            System.out.print("LinkedList is empty");
        } else {
            // Traversing the LinkedList and printing the data of each Node
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}
