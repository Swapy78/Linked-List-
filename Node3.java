//Java program for Node class

package demo;
//Defining of the Node3 class with type parameter T
	class Node3<T extends Comparable<T>> {
		// Declaring instance variables for data and next node
		T data;
		Node3<T> next;

		// Constructor to initialize data and next
		Node3(T data) {
			this.data = data;
			this.next = null;
		}

	}

