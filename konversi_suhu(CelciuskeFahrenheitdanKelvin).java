import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;

        System.out.print("Masukkan suhu dalam Celsius: ");
        celsius = input.nextDouble();

        double fahrenheit = celsius * 9/5 + 32;  // aritmatika
        double kelvin = celsius + 273.15;        // aritmatika

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}
 