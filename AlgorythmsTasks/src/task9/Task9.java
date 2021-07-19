package task9;

import printer.ArrayPrinter;

public class Task9 implements ArrayPrinter {

    int [] arr = {1, -9, 23, 4, 5, 0, 88, 3, 1};

    public static void main(String[] args) {
        Task9 t = new Task9();

        addIndexValueToElements(t.arr);

        ArrayPrinter.printArray(t.arr);
    }

    private static void addIndexValueToElements(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }
    }
}
