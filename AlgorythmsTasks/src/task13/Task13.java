package task13;

import no_such_element_exception.NoSuchElementException;

public class Task13 {

    int [] arr = {-9, 0, 8, -3, 12, 4, 9, -4, 54};

    public static void main(String[] args) {
        Task13 t = new Task13();

        System.out.print("Last negative number: ");

        try {
            System.out.println(getLastNegativeNumber(t.arr));
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int getLastNegativeNumber(int [] arr) throws NoSuchElementException {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 0) {
                return arr[i];
            }

        }

        throw new NoSuchElementException();
    }
}
