package task18;

public class Task18 {

    int [] arr = {9, 1, 23, 4, 0, 6, 9, 5, 4};

    public static void main(String[] args) {
        Task18 t = new Task18();

        printRepetitiveElements(t.arr);
    }

    private static void printRepetitiveElements(int [] arr) {

        for (int element = 0; element < arr.length; element++) {
            for (int elementForComparison = 0; elementForComparison < arr.length;
                     elementForComparison++) {

                if (arr[element] == arr[elementForComparison] &&
                    element != elementForComparison) {
                    System.out.println(arr[element]);
                }

            }
        }
    }
}
