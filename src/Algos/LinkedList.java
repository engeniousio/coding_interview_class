package Algos;

public class LinkedList {

    public ListNode head = null;
    public ListNode tail = null;

    public void printLinkedList() {
        ListNode tmp = head;
        System.out.println();
        while(tmp != null) {
            System.out.print(tmp.val + " => ");
            tmp = tmp.next;
        }
        System.out.print("null");
        System.out.println();

        // TIME: O(n)
    }

    public void addNode(int val) {
        if (head == null) {
            ListNode tmp = new ListNode(val);
            head = tmp;
            tail = tmp;
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        // TIME: O(1)
    }

    public void addNodeAtStart(int val) {
        if (head == null) {
            ListNode tmp = new ListNode(val);
            head = tmp;
            tail = tmp;
        } else {
            ListNode tmp = new ListNode(val);
            tmp.next = head;
            head = tmp;
        }

        // TIME: O(1)
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;

        // TIME: O(n)
        // MEMORY: O(1)
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null || even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;

        // TIME: O(n)
        // MEMORY: O(1)
    }

}
