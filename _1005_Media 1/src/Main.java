import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        double num1 = getDados.nextDouble();
        double num2 = getDados.nextDouble();

        double media = ((num1*3.5)+(num2*7.5))/11;

        System.out.println("MEDIA = "+ String.format("%.5f",media));

    }
}