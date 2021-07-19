package task7;

public class Task7 {

    int [] arr = {1, -9, 23, 4, 5, 0, 88, 3, 1};

    public static void main(String[] args) {
        Task7 t = new Task7();

        getCountOfPositiveNumbers(t.arr);
    }

    private static int getCountOfPositiveNumbers(int [] arr) {
        int count = 0;

        for (int i: arr) {
            if (i > 0) {
                count++;
            }
        }

        System.out.println("Number of elements, which are greater than zero: " +
                count);

        return count;
    }
}
