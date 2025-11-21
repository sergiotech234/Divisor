public class Divisor {
    //creamos un metodo en el cual utilizamos una exception para que de un mensaje de error
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return (double) a / b;
        }

    }
}
