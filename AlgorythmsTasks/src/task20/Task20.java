package task20;

public class Task20 {

    int [] arr = {9, -1, 2, 32, 2, 65, 5, 5};

    public static void main(String[] args) {
        Task20 t = new Task20();

        printNotRepetitiveElements(t.arr);
    }

    private static void printNotRepetitiveElements(int [] arr) {

        OUTER:
        for(int element = 0; element < arr.length; element++) {

            for (int elementForComparison = 0; elementForComparison < arr.length;
                     elementForComparison++) {
                if (arr[element] == arr[elementForComparison] &&
                        element != elementForComparison) {
                    continue OUTER;
                }
            }

            System.out.print(arr[element] + " ");
        }
    }
}
