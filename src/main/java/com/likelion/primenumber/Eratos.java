package com.likelion.primenumber;

import java.util.ArrayList;
import java.util.List;

public class Eratos {
    public void findPNum(int number) {
        List<Integer> num = new ArrayList<>();

        for (int i = 2 ; i < number ; i++) {
            // 2를 제외한 2의 배수를 지우는 로직
            System.out.println(num.size());
        }
    }

    public static void main(String[] args) {
        Eratos eratos = new Eratos();
        eratos.findPNum(50);
    }
}
