package SlowFastPointers;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleDetection {

    // Function to detect cycle
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Creating linked list
        ListNode head = null;
        ListNode temp = null;

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();

            ListNode newNode = new ListNode(val);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        // Create cycle manually
        System.out.print("Enter position to create cycle (-1 for no cycle): ");
        int pos = sc.nextInt();

        if (pos != -1) {

            ListNode cycleNode = head;

            for (int i = 0; i < pos; i++) {
                cycleNode = cycleNode.next;
            }

            temp.next = cycleNode;
        }

        // Checking cycle
        CycleDetection obj = new CycleDetection();

        System.out.println(obj.hasCycle(head));

        sc.close();
    }
}
