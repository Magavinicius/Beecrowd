import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        int num1 = getDados.nextInt();
        int num2 = getDados.nextInt();
        double num3 = getDados.nextDouble();

        double salario = num2 * num3;

        System.out.println("NUMBER = " + num1);
        System.out.println("SALARY = U$ "+ String.format("%.2f",salario));
    }
}