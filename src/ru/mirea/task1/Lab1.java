package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Lab1 {
    public static void main(String[] args) {
        Random r = new Random();
        //ввод массива
        Scanner s =new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size = s.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы");
        for(int i=0;i<size;i++){
            array[i] = s.nextInt();
        }
        //задание 1

        //сумма через FOR
        int sum = 0;
        for(int i=0;i<size;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);

        //сумма через WHILE
        sum = 0;
        int i=0;
        while (i<size) {
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);

        //сумма через DO WHILE
        sum = 0;
        i =0;
        do {
            sum = sum + array[i];
            i++;
        } while (i < size);
        System.out.println(sum);

        //Задание 2
        System.out.println("Аргументы командной строки:");
        for(int k=0; k<args.length;k++){
            System.out.println(args[k]);
        }

        //Задание 3
        System.out.println("первые 10 чисел гармонического ряда");
        for(int j = 1; j<11;j++){
            double m = 1./j;
            System.out.println(m);
        }

        //задание 4
        int[] arr = new int[10];
        System.out.println("Сгенерированный массив");
        for(int l = 0; l< arr.length; l++){
            arr[l] = r.nextInt(100);
            System.out.println(arr[l]);
        }
        sort(arr);
        System.out.println("Отсортированный массив");
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }

        //Задание 5
        System.out.println("Введите число для вычисления факториала");
        System.out.println(fact(s));

    }

    private static int fact(Scanner s) {
        int num, res = 1;
        num = s.nextInt();
        for(int t=1;t<=num;t++){
            res = res*t;
        }
        return res;
    }

}
