package ru.mirea.task10;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int buff = in.nextInt();
        int max = buff;
        int count = 1;
        while (true){
            buff = in.nextInt();
            if (buff == 0){
                break;
            } else if (buff > max){
                max = buff;
                count = 1;
            } else if (buff == max){
                count++;
            }
        }
        System.out.println(count);
    }
}
