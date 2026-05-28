package SlowFastPointers;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class DeletionAtBeginning {

    // Delete the head node and return the new head
    static Node deleteHead(Node head) {

        // Check if the list is empty
        if (head == null)
            return null;

        // Store the current head in a
        // temporary variable
        Node temp = head;

        // Move the head pointer to the next node
        head = head.next;

        // Free the memory of the old head node
        temp = null;

        return head;
    }

    // Function to print the linked list
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 8 -> 2 -> 3 -> 1 -> 7
        Node head = new Node(8);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);

        head = deleteHead(head);
        printList(head);
    }
}
