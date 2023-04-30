//Java program to create Node class

package demo;

// Class to represent a Node in the LinkedList
public class Node {

	int key;
    // Data stored in the Node
    int data;

    // Reference to the next Node in the LinkedList
    Node next;

    // Constructor to create a new Node with a given value
    public Node(int data) {
        this.data = data;
        this.next = null; // By default, the reference to the next Node is null
    }
}
