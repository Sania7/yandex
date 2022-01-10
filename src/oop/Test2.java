package oop;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // если а четное, то записываем его значение, иначе -1
        a = a % 2 == 0 ? a : -1;
        b = b % 2 == 0 ? b : -1;
        c = c % 2 == 0 ? c : -1;

        if ((a < 0) && (b < 0) && (c < 0))
            System.out.print("Чётных чисел нет");
        else
            System.out.print(Math.max(a, Math.max(b,c)));
    }
}
