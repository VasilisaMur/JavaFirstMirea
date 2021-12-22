package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeueTest {
    Deque<Integer> firstPlayer = new ArrayDeque<>();
    Deque<Integer> secondPlayer = new ArrayDeque<>();

    DequeueTest() {
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

    public int getFirstNode(Deque<Integer> player) {
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
        DequeueTest main = new DequeueTest();
    }
}