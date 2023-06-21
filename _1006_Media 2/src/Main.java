import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        double num1 = getDados.nextDouble();
        double num2 = getDados.nextDouble();
        double num3 = getDados.nextDouble();

        double media = ((num1*2)+(num2*3)+(num3*5))/10;

        System.out.println("MEDIA = "+ String.format("%.1f",media));

    }
}