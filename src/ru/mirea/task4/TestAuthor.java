package ru.mirea.task4;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Oleg", "oleg0001@mail.ru", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a1.setEmail("oleg002@mail.ru");
        System.out.println(a1);
    }
}
