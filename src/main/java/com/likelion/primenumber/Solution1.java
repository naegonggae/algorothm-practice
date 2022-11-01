package com.likelion.primenumber;

public class Solution1 {
    boolean isPrime(int num) {
        // num = 13이니까 12까지 나누어 봅니다.
        for (int i = 2; i < num; i++) {
            if(num % i != 0) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.isPrime(13);
    }
}
