import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        int raio = getDados.nextInt();
        double pi = 3.14159;

        double volume = (4.0/3)*pi*raio*raio*raio;

        System.out.println("VOLUME = " + String.format("%.3f",volume));

    }
}