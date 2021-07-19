package task21;

import java.util.ArrayList;

public class Task21 {

    int [] arr1 = {1, 23, 4, 9};
    int [] arr2 = {2, 8, 1, 6};

    public static void main(String[] args) {
        Task21 t = new Task21();

        printUniqueElements(t.arr1, t.arr2);
    }

    private static void printUniqueElements(int [] arr1, int [] arr2) {

        if (arr1.length > arr2.length) {
            whenFirstIsLarger(arr1, arr2);
            return;
        } else if (arr1.length < arr2.length) {
            whenSecondIsLarger(arr2, arr1);
            return;
        }

        int i = arr1.length - 1;

        while (i > 0) {

            if (arr1[i] == arr2[i]) {
                continue;
            }

            System.out.println(arr1[i--]);
        }
    }

    private static void whenSecondIsLarger(int [] larger, int [] smaller) {
        ArrayList <Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < larger.length; i++) {
            for (int j = 0; j < smaller.length; j++) {
                if (larger[i] == smaller[j]) {
                    duplicates.add(smaller[j]);
                }
            }
        }

        OUTER:
        for (int value : smaller) {
            for (int duplicate : duplicates) {
                if (value == duplicate) {
                    continue OUTER;
                }
            }
            System.out.println(value);
        }
    }

    private static void whenFirstIsLarger(int [] larger, int [] smaller) {
        OUTER:
        for (int i = 0; i < larger.length; i++) {
            for (int j = 0; j < smaller.length; j++) {
                if (larger[i] == smaller[j]) {
                    continue OUTER;
                }
            }
            System.out.println(larger[i]);
        }
    }
}
