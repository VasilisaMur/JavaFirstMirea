package ru.mirea.task28;

public class Car {

    public void drive(){
        System.out.println("Eдет");
    }
    private class car2{

        public void descr(){
            System.out.println("Вложенный класс");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        Car.car2 c = car.new car2(); //тестирование вложенного класса
        c.descr();
        Car car1 = new Car().new Car1();
        car1.drive();
    }

    private class Car1 extends Car{
        @Override
        public void drive() {
            System.out.println("Анонимный класс");
        }
    }
}