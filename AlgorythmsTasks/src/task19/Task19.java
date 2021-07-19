package task19;

public class Task19 {

    int [] arr = {-8, 12, 3, 5, 2, 9, 8, 54, 0};

    public static void main(String[] args) {
        Task19 t = new Task19();

        System.out.println(t.numberOfElementsGreaterThanAverage(t.arr));
    }

    private int numberOfElementsGreaterThanAverage(int [] arr) {
        double avg = computeAverage(arr);
        int count = 0;

        for (int i : arr) {
            if (i > avg) {
                count++;
            }
        }

        return count;
    }

    private double computeAverage(int [] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum/arr.length;
    }

}
