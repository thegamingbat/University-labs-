public class indexOutOF extends Throwable {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5 };
        int index = 5;
        try {
            int element = arr[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException caught: " + ex.getMessage());
        }
    }

}
