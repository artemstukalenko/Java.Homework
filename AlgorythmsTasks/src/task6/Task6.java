package task6;

public class Task6 {

    int [] arr = {1, -9, 23, 4, 5, 0, 88, 3, 1};

    public static void main(String[] args) {
        Task6 t = new Task6();

        countOfZeroElements(t.arr);
    }

    private static int countOfZeroElements(int [] arr) {
        int count = 0;

        for(int i : arr) {
            if (i == 0) {
                count++;
            }
        }

        System.out.println("Number of elements, which are equal to zero: " +
                count);

        return count;
    }
}
