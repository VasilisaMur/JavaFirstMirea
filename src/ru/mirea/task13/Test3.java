package ru.mirea.task13;

import java.util.Arrays;

class Test3 {
    private int[] arr;

    public Test3() {
        arr = new int[1];
    }

    public Test3(int length) {
        arr = new int[length];
    }

    public void add(int number) {
        arr[arr.length - 1] = number;
        arr = Arrays.copyOf(arr, arr.length + 1);
    }

    public void remove(int index) {
        for (int a = index; a < arr.length - 1; a++) {
            arr[a] = arr[a + 1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
    }

    public static void main(String[] args) {
        Test3 list = new Test3();
        System.out.println(list.arr.length);
        list.add(5);
        System.out.println(list.arr.length);
        list.add(10);
        System.out.println(list.arr.length);
        list.remove(0);
        System.out.println(list.arr.length);
    }
}