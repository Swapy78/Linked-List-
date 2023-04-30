package demo;

	class SortedLinkedList<T extends Comparable<T>> {
	    Node3<T> head;

	    // Add a node to the linked list in ascending order
	    void add(T data) {
	        Node3<T> newNode = new Node3<T>(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        if (head.data.compareTo(data) > 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node3<T> current = head;
	        while (current.next != null && current.next.data.compareTo(data) < 0) {
	            current = current.next;
	        }

	        newNode.next = current.next;
	        current.next = newNode;
	    }

	    // Print the linked list
	    void printLinkedList() {
	        Node3<T> current = head;
	        while (current != null) {
	            System.out.print(current.data + "->");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

