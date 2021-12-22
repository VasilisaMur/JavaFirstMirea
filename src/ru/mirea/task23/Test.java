package ru.mirea.task23;

public class Test {
    int id;
    String name;
    Test(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        int result;
        if (name == null)
            result = 0;
        else
            result = name.hashCode();
        result = result + id;
        return result;
    }
    public static void main(String[] args) {
        Test obj1 = new Test(111, "aaa");
        Test obj2 = new Test(222, "bbb");
        Test obj3 = new Test(222, "bbb");
        Test obj4 = new Test(111, "bbb");
        Test obj5 = new Test(111, null);
        System.out.println("Хеш-код obj1: " + obj1.hashCode());
        System.out.println("Хеш-код obj2: " + obj2.hashCode());
        System.out.println("Хеш-код obj3: " + obj3.hashCode());
        System.out.println("Хеш-код obj4: " + obj4.hashCode());
        System.out.println("Хеш-код obj5: " + obj5.hashCode());
        System.out.println("Сравнить obj1 и obj2: ");
        System.out.println(obj1.hashCode() == obj2.hashCode());
        System.out.println("Сравнить obj2 и obj3: ");
        System.out.println(obj2.hashCode() == obj3.hashCode());
    }
}
