package com.bridgelabz.hashmap;

public class Node<K, T> {
    K key;
    T Value;
    Node next;

    public Node(K key, T value) {
        this.key = key;
        this.Value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", Value=" + Value +
                ", next=" + next +
                '}';
    }

}
