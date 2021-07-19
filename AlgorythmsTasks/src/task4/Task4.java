package task4;

public class Task4 {

    int [] arr = {1, -9, 23, 4, 5, 88, 3};

    public static void main(String[] args) {
        Task4 t = new Task4();
        System.out.println(getAvgValue(t.arr));
    }

    private static double getAvgValue(int [] arr) {
        double sum = 0;
        int count;

        for (count = 0; count < arr.length; count++) {
            sum += arr[count];
        }

        return sum/count;
    }

}
