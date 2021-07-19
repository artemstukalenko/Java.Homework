package task14;

import java.util.ArrayList;

public class Task14 {

    int [] arr = {1, -9, 23, 4, 5, 0, 5, 5, 88, 3, 1};

    public static void main(String[] args) {
        Task14 t = new Task14();

        System.out.println(getIndexesOfElement(5, t.arr));
    }

    private static ArrayList <Integer> getIndexesOfElement(int input, int [] arr) {
        ArrayList <Integer> indexesOfInput = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                indexesOfInput.add(i);
            }
        }

        return indexesOfInput;
    }
}
