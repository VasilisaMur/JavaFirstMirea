package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListTest {
    LinkedList<Integer> firstPlayer = new LinkedList<>();
    LinkedList<Integer> secondPlayer = new LinkedList<>();

    DoubleListTest() {
        distribution();
        play(0);
    }

    public void distribution() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            firstPlayer.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            secondPlayer.add(scanner.nextInt());
        }
    }

    public int getFirstNode(LinkedList<Integer> player) {
        return player.poll();
    }

    public void compare() {
        int firstPlayerNode = getFirstNode(firstPlayer);
        int secondPlayerNode = getFirstNode(secondPlayer);
        if (firstPlayerNode < secondPlayerNode || (firstPlayerNode == 9 && secondPlayerNode == 0)) {
            secondPlayer.add(firstPlayerNode);
            secondPlayer.add(secondPlayerNode);
        } else {
            firstPlayer.add(firstPlayerNode);
            firstPlayer.add(secondPlayerNode);
        }
    }

    public void play(int k) {
        if (firstPlayer.isEmpty()) {
            System.out.println("second " + k);
            return;
        } else if (secondPlayer.isEmpty()) {
            System.out.println("first " + k);
            return;
        } else if (k > 106) {
            System.out.println("botva");
            return;
        } else {
            compare();
            k++;
            play(k);
        }
    }

    public static void main(String[] args) {
        DoubleListTest main = new DoubleListTest();
    }
}