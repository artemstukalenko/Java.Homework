package task3;

public class Task3 {

    int [] arr = {1, -9, 23, 4, 5, 88, 3};

    public static void main(String[] args) {
        Task3 t = new Task3();
        getMinElement(t.arr);
    }

    private static void getMinElement(int [] arr) {
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        System.out.println("Min element value = " + arr[min]);
        System.out.println("Min element index = " + min);
    }

}
