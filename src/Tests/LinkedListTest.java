package Tests;

import Algos.LinkedList;
import Algos.ListNode;

public class LinkedListTest {

    @org.junit.jupiter.api.Test
    void printLLTest() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        LinkedList linkedList = new LinkedList();
        linkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        linkedList.printLinkedList();
    }

    @org.junit.jupiter.api.Test
    void addNodeTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);

        linkedList.printLinkedList();
    }

    @org.junit.jupiter.api.Test
    void addNodeAtStartTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);

        linkedList.addNodeAtStart(1);

        linkedList.printLinkedList();
    }

    @org.junit.jupiter.api.Test
    void deleteNodeTest() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        LinkedList linkedList = new LinkedList();
        linkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        linkedList.deleteNode(fourth);

        linkedList.printLinkedList();
    }
}
