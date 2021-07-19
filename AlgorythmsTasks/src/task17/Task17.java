package task17;

import printer.ArrayPrinter;

public class Task17 implements ArrayPrinter {

    int [] arr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        Task17 t = new Task17();


        ArrayPrinter.printArray(arrayShift(3, t.arr));
    }

    private static int [] arrayShift(int shift, int [] arr) {
        int [] result = new int [arr.length + shift];
        System.out.println(arr.length);

        for (int i = shift; i < result.length; i++) {
            result[i] = arr[i - shift];
        }

        return result;
    }
}
