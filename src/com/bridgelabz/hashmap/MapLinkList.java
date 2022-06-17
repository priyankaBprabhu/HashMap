package com.bridgelabz.hashmap;

public class MapLinkList<K, T>  {
    Node head;

    public int add(K key, T value) {
        Node newNode = new Node(key, value);
       int count = 0;
        if (head == null) {
            head = newNode;
            count++;
            return count;
        }
        Node temp = head;
        while ((temp.next != null)&&!(temp.key.equals(key))) {

            temp = temp.next;
        }
        if (temp.key.equals(key)) {
            temp.Value = value;
            return count;
        }
        temp.next = newNode;
        count++;
        return count;
    }

    public T search(K key) {
        Node temp = head;
        while (temp != null) {
            if (temp.key.equals(key))
                return (T) temp.Value;
            else
                temp = temp.next;
        }
        return null;

    }

    public void pop(K key) {
        Node temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                if (temp == head)
                    head = temp.next;
                temp.Value = null;
                temp.key = null;
                return;
            }
            temp = temp.next;
        }
    }


    @Override
    public String toString() {
        return "MapLinkedList{" +
                "head=" + head +
                '}';
    }
}
