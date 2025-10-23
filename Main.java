// project Yordany calculadora chafa
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num1;
        double num2;
        String operacion;

        System.out.println("Primer numero:");
        num1 = teclado.nextDouble();

        System.out.println("Operacion (+, -, *, /):");
        operacion = teclado.next();

        System.out.println("Segundo numero:");
        num2 = teclado.nextDouble();

        switch (operacion) {
            case "+" -> System.out.println("Resultado: " + (num1 + num2));
            case "-" -> System.out.println("Resultado: " + (num1 - num2));
            case "*" -> System.out.println("Resultado: " + (num1 * num2));
            case "/" -> System.out.println("Resultado: " + (num1 / num2));
            default -> System.out.println("Operacion invalida");
        }
    }
}