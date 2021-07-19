package task23;

import printer.ArrayPrinter;

public class Task23 implements ArrayPrinter {

    int [] arr1 = {-9, 1, 5};
    int [] arr2 = {3, 6, 8, 23, 44, 54};

    public static void main(String[] args) {
        Task23 t = new Task23();

        ArrayPrinter.printArray(mergeIntoSortedArray(t.arr1, t.arr2));
    }

    private static int [] mergeIntoSortedArray(int [] arr1, int [] arr2) {
        int i = 0;
        int j = 0;
        int tempIndex = 0;
        int [] tempArr = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            tempArr[tempIndex++] = (arr1[i] >= arr2[j]) ? arr2[j++] : arr1[i++];
        }

        if (arr1.length > arr2.length) {
            System.arraycopy(arr1, i, tempArr, tempIndex, arr1.length - i);
        } else if (arr1.length < arr2.length) {
            System.arraycopy(arr2, j, tempArr, tempIndex, arr2.length - j);
        }

        return tempArr;
    }
}
