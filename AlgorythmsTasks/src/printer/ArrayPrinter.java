package printer;

public interface ArrayPrinter {

    static void printArray(int [] arr) {

        for (int i : arr) {
            System.out.print(i + ", ");
        }

    }

}
