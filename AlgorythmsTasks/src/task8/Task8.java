package task8;

import java.util.Arrays;

public class Task8 {

    int [] arr = {1, -9, 23, 4, 5, 0, 88, 3, 1};

    public static void main(String[] args) {
        Task8 t = new Task8();

        multiplyElementsBy(3, t.arr);
    }

    private static void multiplyElementsBy(int multiplier, int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= multiplier;
        }
    }
}
