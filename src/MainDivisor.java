public class MainDivisor {
    public static void main(String[] args) {
        Divisor n1 = new Divisor();

        try{
            int a =10;
            int b =4;
            double c = n1.dividir(a,b);
            System.out.println("El resultado de la division es: "+ c);
        }catch(ArithmeticException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}