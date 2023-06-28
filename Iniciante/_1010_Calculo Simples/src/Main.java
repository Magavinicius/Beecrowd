import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        int produtoUm = getDados.nextInt();
        int quantidadeUm = getDados.nextInt();
        double valorUm = getDados.nextDouble();
        int produtoDois = getDados.nextInt();
        int quantidadeDois = getDados.nextInt();
        double valorDois = getDados.nextDouble();


        double total = (quantidadeUm * valorUm) + (quantidadeDois*valorDois);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f",total));

    }
}