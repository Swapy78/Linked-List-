/*
 * Java program got main method to to create Linked List by appending
 *  30 & 70 to 56
 */

package demo;

public class Main3 {
	
    // Defining the main function
    public static void main(String[] args) {
        // Creating a new object of class LinkedList3
        LinkedList3 list = new LinkedList3();
        
        // Appending nodes with values 56, 30, and 70 to the linked list
        list.append(56);
        list.append(30);
        list.append(70);
        
        // Printing the linked list
        list.printLinkedList();
    }
}


