import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        double a = getDados.nextDouble();
        double b = getDados.nextDouble();
        double c = getDados.nextDouble();
        double pi = 3.14159;

        double triangulo = (a*c)/2;
        double circulo = pi*c*c;
        double trapezio = ((a+b)*c)/2;
        double quadrado = b*b;
        double retangulo = a*b;



        System.out.println("TRIANGULO: " + String.format("%.3f",triangulo));
        System.out.println("CIRCULO: " + String.format("%.3f",circulo));
        System.out.println("TRAPEZIO: " + String.format("%.3f",trapezio));
        System.out.println("QUADRADO: " + String.format("%.3f",quadrado));
        System.out.println("RETANGULO: " + String.format("%.3f",retangulo));

    }
}