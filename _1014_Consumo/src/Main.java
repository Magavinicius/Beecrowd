import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        int distancia = getDados.nextInt();
        double combustivel = getDados.nextDouble();

        double media = distancia/combustivel;

        System.out.println(String.format("%.3f", media) + " km/l");

    }
}