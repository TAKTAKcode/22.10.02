package com.tak.study;

import java.util.Scanner;

public class Study {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요? : ");

        int num = sc.nextInt();                         //정수의 개수
        int sum = 0;                                    //합계
        int i;

        for (i = 0; i < num; i++) {
            System.out.print("정수 (0으로 종료) : ");
            int t = sc.nextInt();

            if (t == 0) {                               //0으로 종료니까 빠져나간다.
                break;
            }
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다!");

        if (i != 0) {
            System.out.println("평균은 " + sum/i + "입니다!");
        }
    }
}
