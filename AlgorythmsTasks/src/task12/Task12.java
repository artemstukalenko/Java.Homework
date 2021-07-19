package task12;

import no_such_element_exception.NoSuchElementException;

public class Task12 {

    int [] arr = {-9, 0, -1, -3, -4, -12, 8};

    public static void main(String[] args) {
        Task12 t = new Task12();

        System.out.print("First positive number: ");

        try {
            System.out.println(getFirstPositiveNumber(t.arr));
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }

    }

    private static int getFirstPositiveNumber(int [] arr)
            throws NoSuchElementException {

        for (int i : arr) {

            if (i > 0) {
                return i;
            }

        }

        throw new NoSuchElementException();
    }
}
