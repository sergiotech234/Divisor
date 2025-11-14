public class Divisor {
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return (double) a / b;
        }

    }
}
