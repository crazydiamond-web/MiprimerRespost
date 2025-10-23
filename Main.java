import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo = "";
        // Aqui ponemos nuestros tipos de temperatura a convertir;
        double grados = 0;
        double fahrenheit = 0;
        double kelvin = 0;
        double celsius = 0;
        System.out.println("Intresa el nombre de la temperatura a convertir por ejemplo: Celsius, Fahrenheit,Kelvin.");
        System.out.println("Despues introduce un numero");
        tipo = teclado.nextLine();
        if (tipo.equals("Celsius")) {
            System.out.println("Ingresa la temperatura en Celsius");
            grados = teclado.nextDouble();
            fahrenheit = (grados * 9 / 5) + 32;
            kelvin = grados + 273.15;

            System.out.println(grados + "°C equivale a:");
            System.out.println("- " + fahrenheit + "°F");
            System.out.println("- " + kelvin + "K");

        } else if (tipo.equals("Fahrenheit")) {
            System.out.println("Ingresa la temperatura en Fahrenheit:");
            grados = teclado.nextDouble();
            celsius = (grados - 32) * 5 / 9;
            kelvin = (grados - 32) * 5 / 9 + 273.15;

            System.out.println(grados + "°F equivale a:");
            System.out.println("- " + celsius + "°C");
            System.out.println("- " + kelvin + "K");

        } else if (tipo.equals("Kelvin")) {
            System.out.println("Ingresa la temperatura en Kelvin:");
            grados = teclado.nextDouble();
            celsius = grados - 273.15;
            fahrenheit = (grados - 273.15) * 9 / 5 + 32;

            System.out.println(grados + "K equivale a:");
            System.out.println("- " + celsius + "°C");
            System.out.println("- " + fahrenheit + "°F");

        } else {
            System.out.println("Temperatura no válida. Escribe: Celsius, Fahrenheit o Kelvin");
        }

        teclado.close();
    }
}

