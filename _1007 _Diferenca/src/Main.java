import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        int num1 = getDados.nextInt();
        int num2 = getDados.nextInt();
        int num3 = getDados.nextInt();
        int num4 = getDados.nextInt();

        int diferenca = (num1*num2)-(num3*num4);

        System.out.println("DIFERENCA = " + diferenca);


    }
}