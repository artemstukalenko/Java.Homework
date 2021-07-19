package task10;

import printer.ArrayPrinter;

public class Task10 implements ArrayPrinter{

    int [] arr = {1, -9, 23, 4, 5, 0, 88, 3, 1, 6};

    public static void main(String[] args) {
        Task10 t = new Task10();

        setEvenNumbersToZero(t.arr);

        ArrayPrinter.printArray(t.arr);
    }

    private static void setEvenNumbersToZero(int [] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }

        }
    }
}
