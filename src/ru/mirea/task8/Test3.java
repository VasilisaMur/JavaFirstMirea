package ru.mirea.task8;

import javax.swing.*;

public class Test3 extends Animation{
    public static void main(String[] args) {
        new Animation();
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\0.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\1.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\2.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\3.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\4.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\5.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\6.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\7.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\8.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\9.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\10.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\11.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\12.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\13.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\14.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\15.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\16.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\17.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\18.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\19.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\20.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\21.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\22.jpg").getImage());
        framelist.add(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\img\\23.jpg").getImage());
        Animation a1 = new Animation();
        while (true) {
            for (int i = 0; i < 24; i++) {
                image = framelist.get(i);
                a1.repaint();
                try {
                    Thread.sleep(38);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
