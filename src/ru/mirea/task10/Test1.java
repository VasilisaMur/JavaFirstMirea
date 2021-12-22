package ru.mirea.task10;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int curr_num = 1;
        int counter = 0;
        for (int i = 1; i <= n; i++){
            System.out.println(curr_num);
            counter++;
            if (counter == curr_num){
                curr_num++;
                counter = 0;
            }
        }
    }
}
