package task11;

import printer.ArrayPrinter;

public class Task11 implements ArrayPrinter {

    int [] arr = {1, -9, 23, 4, 5, 0, 88, 3, 1, 6};

    public static void main(String[] args) {
        Task11 t = new Task11();

        setOddIndexesToZero(t.arr);

        ArrayPrinter.printArray(t.arr);
    }

    private static void setOddIndexesToZero(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!(i % 2 == 0)) {
                arr[i] = 0;
            }
        }
    }
}
