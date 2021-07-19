package task24;

import printer.ArrayPrinter;

public class Task24 implements ArrayPrinter {

    int [] arr = {1, 3, 0, 56, 6, 2, -3, 7, 8, 4,};
    int [] arrOnlyPositiveNumbers = {1, 3, 56, 6, 2, 7, 8, 4,};

    public static void main(String[] args) {
        Task24 t = new Task24();

        ArrayPrinter.printArray(t.swapPolarElements(t.arrOnlyPositiveNumbers));

        System.out.println();
        System.out.println("--------------------------");

        ArrayPrinter.printArray(t.swapPolarElements(t.arr));
    }

    private int [] swapPolarElements(int [] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] > 0 && arr[j] > 0) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (arr[i] <= 0){
                i++;
            } else if (arr[j] <= 0) {
                j--;
            }

        }

        return arr;
    }

    private void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
