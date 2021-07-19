package task2;

public class Task2 {

    int [] arr = {1, -9, 23, 4, 5, 88, 3};

    public static void main(String[] args) {
        Task2 t = new Task2();
        getMaxElement(t.arr);
    }

    private static void getMaxElement(int [] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        System.out.println("Max element value = " + arr[max]);
        System.out.println("Max element index = " + max);
    }
}
