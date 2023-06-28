import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        String nome = getDados.next();
        double salario = getDados.nextDouble();
        double bonus = getDados.nextDouble();

        double totalReceber = salario + (bonus * 0.15);

        System.out.println("TOTAL = R$ " + String.format("%.2f",totalReceber));

    }
}