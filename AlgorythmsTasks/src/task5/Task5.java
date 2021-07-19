package task5;

public class Task5 {

    int [] arr = {1, -9, 23, 4, 5, 88, 3, 1};

    public static void main(String[] args) {
        Task5 t = new Task5();

        getCountOf(5, t.arr);
    }

    private static int getCountOf(int userInput, int [] arr) {
        int count = 0;

        for (int i : arr) {
            if (i == userInput) {
                count++;
            }
        }

        System.out.println("The count of elements, which are equal to your input: " +
                count);

        return count;
    }
}
