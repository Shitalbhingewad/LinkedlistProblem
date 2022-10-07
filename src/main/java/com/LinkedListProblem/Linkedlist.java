package com.LinkedListProblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Linkedlist {
    private static final Logger logger = LogManager.getLogger(App.class);
    Node head;

    void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node temp;
            temp = head;
            head = node;
            head.next = temp;
        }
    }

    void insertNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void insertAtIndex(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            insertAtStart(data);
        } else {
            Node temp;
            temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void showLinkedList() {
        Node temp = head;
        while (temp.next != null) {
            logger.info(temp.data);
            temp = temp.next;
        }
        logger.info(temp.data);
    }

    void deleteNode(int index) {
        Node node;
        Node temp;
        temp = head;
        if (head == null) {
            logger.info("NO list exists!!");
        } else {

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            if (index == 0) {

                head = head.next;
                temp = null;

            } else {
                node = temp.next;
                temp.next = node.next;
                node = null;
            }

        }

    }

    void searchNodeWithKey(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            logger.info("Linked list empty!!");
        } else {
            Node temp;
            temp = head;
            while (temp != null) {
                if (temp.data == node.data) {
                    logger.info("Node Found " + node.data);
                    break;
                } else {
                    temp = temp.next;
                }
            }

        }
    }

    void sizeOfLinkedList() {
        Node temp;
        temp = head;
        int count = 0;
        if (head == null) {
            logger.info("List is empty!");
        } else {
            while (temp.next != null) {
                temp = temp.next;
                count++;
            }
            count++;
            logger.info("Size of Linked list is " + count);
        }

    }
}