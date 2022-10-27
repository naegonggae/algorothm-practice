package com.likelion.hash;

public class HashFunction {

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            // char c = key.charAt(i);
            // int ascii = c;
            // System.out.printf("%s %d\n" ,c, ascii);
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }
}


