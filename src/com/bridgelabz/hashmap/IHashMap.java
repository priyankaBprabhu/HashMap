package com.bridgelabz.hashmap;

public interface IHashMap<K , T> {
    void add(K key,T value);
    T get(K key);
    void remove(K key);
    int getSize();
    boolean isEmpty();



}
