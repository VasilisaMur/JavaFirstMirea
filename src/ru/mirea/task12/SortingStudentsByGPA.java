package ru.mirea.task12;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGpa(), o2.getGpa());
    }

    public void sortPrint(Student[] students){
        quickSortReversed(students, 0, students.length - 1);
        System.out.println(Arrays.toString(students));
    }

    public void quickSortReversed(Student[] students, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = students[(leftMarker + rightMarker) / 2];
        do {
            while (compare(students[leftMarker], pivot) > 0) {
                leftMarker++;
            }
            while (compare(students[rightMarker], pivot) < 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSortReversed(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortReversed(students, leftBorder, rightMarker);
        }
    }

    public void mergeSort(Student[] students, int left, int right){
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(students, left, delimiter - 1);
            mergeSort(students, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || compare(students[cursor], students[delimiter]) < 0) {
                buffer[i] = students[cursor];
                cursor++;
            } else {
                buffer[i] = students[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, students, left, buffer.length);
    }
}
