package com.bridgelabz.hashmap;

public class HashMapMain {
    public static void main(String[] args) {
        System.out.println("HashMap Implementations");
        HashMapImplementation<String, Integer> hashmap = new HashMapImplementation<>();
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashmap.get(word);
            if (value == null) {
                value = 0;
            }
            value += 1;
            hashmap.add(word, value);
        }
        hashmap.remove("avoidable");
        System.out.println(hashmap);
    }
}
