package task15;

public class Task15 {

    int [] unsortedArray = {1, -9, 23, 4, 5, 0, 5, 5, 88, 3, 1};
    int [] sortedArray = {12, 23, 26, 40, 52};

    public static void main(String[] args) {
        Task15 t = new Task15();

        System.out.println(isSortedAscending(t.sortedArray));
        System.out.println(isSortedAscending(t.unsortedArray));
    }

    private static boolean isSortedAscending(int [] arr) {
        boolean isSorted = true;

        for (int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 1; i < lastIndex; i++) {
                if (arr[i] < arr[i - 1]) {
                    isSorted = false;
                }
            }
        }

        return isSorted;
    }
}
