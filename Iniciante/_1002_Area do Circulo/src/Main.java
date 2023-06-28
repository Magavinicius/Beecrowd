import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        double num1 = getDados.nextDouble();
        double pi = 3.14159;

        double area = pi * (num1 * num1);
        ;

        System.out.println("A="+ String.format("%.4f",area));
    }
}