package ru.mirea.task17;

import java.util.Scanner;

public enum Planet {
    Mercury(0.330,4879),
    Venus(4.87, 12104),
    Earth(5.97, 12756),
    Mars(0.642, 6792);


    private double mass;
    private double radius;

    Planet(double mass, double diameter) {
        this.mass = mass;
        this.radius = diameter / 2;
    }

    public double getMass() {
        return this.mass;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getGravity(){
        final double G = 6.674 * Math.pow(10, -11);
        double mass = this.mass * Math.pow(10, 24);
        double radius = this.radius * Math.pow(10, 3);

        return (G * mass) / (Math.pow(radius, 2));
    }

    public void printInfo(){
        System.out.println("Сила притяжения: " + this.getGravity() + " Н/кг");
    }

    public static void main(String[] args) {
        int choice = -1;
        Scanner in = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Выберите планету, чтобы узнать информацию о ней");
            System.out.println("1 - Меркурий");
            System.out.println("2 - Венера");
            System.out.println("3 - Земля");
            System.out.println("4 - Марс");
            System.out.println("0 - Завершить");
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Меркурий");
                    Planet.Mercury.printInfo();
                    break;
                }
                case 2: {
                    System.out.println("Венера");
                    Planet.Venus.printInfo();
                    break;
                }
                case 3: {
                    System.out.println("Земля");
                    Planet.Earth.printInfo();
                    break;
                }
                case 4: {
                    System.out.println("Марс");
                    Planet.Mars.printInfo();
                    break;
                }

                case 0: {
                    break;
                }
            }
        }
    }
}