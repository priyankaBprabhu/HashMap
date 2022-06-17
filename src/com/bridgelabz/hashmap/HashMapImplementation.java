package com.bridgelabz.hashmap;

import java.util.Arrays;

public class HashMapImplementation<K,T> implements IHashMap <K ,T> {
    MapLinkList[] bucket = new MapLinkList[5];
    int size = 0;
    public void add(K key, T value) {
        int index = Math.abs((int)key.hashCode() % bucket.length);
        if(bucket[index] == null){
            bucket[index] = new MapLinkList<K, T>();
        }
        size += bucket[index].add(key,value);
    }

    @Override
    public T get(K key) {
        try {
            int index =Math.abs( (int)key.hashCode() % bucket.length);
            return (T) bucket[index].search(key);
        }catch (NullPointerException e){
            System.out.println("Entered key is not available");
        }
        return null;
    }

    public void remove(K key) {
        int index = key.hashCode() % bucket.length;
        bucket[index].pop(key);
        size--;
    }



    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hashmap{" +
                "bucket=" + Arrays.toString(bucket) +
                '}';
    }


}
