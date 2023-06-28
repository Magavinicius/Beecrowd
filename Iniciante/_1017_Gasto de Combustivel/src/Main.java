import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner getDados = new Scanner(System.in);
        int tempoGasto = getDados.nextInt();
        int velocidadeMedia = getDados.nextInt();


        double totalPercorrido = tempoGasto * velocidadeMedia;

        double litroGasto = totalPercorrido / 12;

       System.out.println(String.format("%.3f",litroGasto));

    }
}