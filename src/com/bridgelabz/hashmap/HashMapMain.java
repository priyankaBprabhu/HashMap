package com.bridgelabz.hashmap;

public class HashMapMain {
    public static void main(String[] args) {
        System.out.println("HashMap Implementations");
        HashMapImplementation<String, Integer> hashmap = new HashMapImplementation<>();
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashmap.get(word);
            if (value == null) {
                value = 0;
            }
            value += 1;
            hashmap.add(word, value);
        }
        System.out.println(hashmap);
    }
}
