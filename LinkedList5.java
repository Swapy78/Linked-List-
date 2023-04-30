//Java program to delete the first element in the LinkedList of sequence 56->30->70 

package demo;

//Defining the LinkedList class with a head node
public class LinkedList5 {
 Node head;

 // Appending a new node to the end of the LinkedList
 public void append(int data) {
     Node newNode = new Node(data);

     // If the head node is empty, setting it to the new node
     if (head == null) {
         head = newNode;
         return;
     }

// Traversing the LinkedList to find the last node and adding the new node to it
     Node current = head;
     while (current.next != null) {
         current = current.next;
     }
     current.next = newNode;
 }

 // Printing the LinkedList starting from the head node
 public void printLinkedList() {
     // If the head node is empty, printing that the LinkedList is empty
     if (head == null) {
         System.out.print("LinkedList is empty");
     } else {
         // Traversing the LinkedList and print each node's data
         Node temp = head;
         while (temp != null) {
             System.out.print(temp.data + " -> ");
             temp = temp.next;
         }
     }
 }

 // Removing the last node of the LinkedList
 public void popLast() {
 // If the head node is empty or if it is the only node, setting it to null
     if (head == null || head.next == null) {
         head = null;
         return;
     }

// Traversing the LinkedList to find the second to last node and setting its next node to null
     Node current = head;
     while (current.next.next != null) {
         current = current.next;
     }
     current.next = null;
 }
}
