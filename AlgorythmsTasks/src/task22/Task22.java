package task22;

public class Task22 {

    int [] arr = {9, -1, 2, 32, 9, 2, 65, 5, 5, 9};

    public static void main(String[] args) {
        Task22 t = new Task22();

        System.out.print("Number of elements, which are equal to first element: ");
        System.out.println(howManyElementsEqualsToFirst(t.arr));
    }

    private static int howManyElementsEqualsToFirst(int [] arr) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[0]) {
                count++;
            }
        }

        return count;
    }
}
