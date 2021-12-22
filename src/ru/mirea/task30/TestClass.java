package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class TestClass {

    @Test
    public void testToString() {
        Author a1 = new Author("Name1", "name1@ya.ru", 'm');
        Author a2 = new Author("Name2", "name2@ya.ru", 'm');

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Name1" + " (" + 'm' + ") at " + "name1@ya.ru");
        expected.add("Name2" + " (" + 'm' + ") at " + "name2@ya.ru");

        ArrayList<String> actual = new ArrayList<>();
        actual.add(a1.toString());
        actual.add(a2.toString());

        Assert.assertEquals(expected, actual);
    }
}