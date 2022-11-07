package com.likelion.harshad;

public class HarshadSolution {
    public boolean solution(int x) {
        // 자릿수 합
        int sumOfDigit = 0;
        while (x > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        System.out.println(sumOfDigit);

        return false;
    }

    public static void main(String[] args) {
        HarshadSolution harshadSolution = new HarshadSolution();
        harshadSolution.solution(234);
    }
}

