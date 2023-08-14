class DivisionbyZeroException extends Exception {
    public DivisionbyZeroException(String message) {
        super(message);
    }
}

public class divideByZero{
    static int computeDivision(int a, int b) throws DivisionbyZeroException {
        int res = 0;
        try {
            if (b == 0) {
                throw new DivisionbyZeroException("Division by zero is not allowed.");
            }
            System.out.println("Before division: a = " + a + ", b = " + b);
            res = a / b;
            System.out.println("After division, result: " + res);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException is occurred");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException is occurred: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        return res;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 0;
        try {
            int i = computeDivision(a, b);
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught in main method: " + ex.getMessage());
        } catch (DivisionbyZeroException ex) {
            System.out.println("Custom Exception caught in main method: " + ex.getMessage());
        }
    }
}
