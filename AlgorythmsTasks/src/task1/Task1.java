package task1;

public class Task1 {

    int [] arr = {1, -9, 23, 4, 5, 88, 3};

    public static void main(String[] args) {
        Task1 t = new Task1();
        System.out.println(sumElements(t.arr));
    }

    private static int sumElements(int [] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
