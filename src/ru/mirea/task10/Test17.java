package ru.mirea.task10;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int buff;
        int max = -999999999;
        while (true){
            buff = in.nextInt();
            if (buff == 0){
                break;
            }
            if (buff > max){
                max = buff;
            }
        }
        System.out.println(max);
    }
}
