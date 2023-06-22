import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        int a = getDados.nextInt();
        int b = getDados.nextInt();
        int c = getDados.nextInt();

        int maiorAB = ((a+b) + Math.abs(a-b))/2;
        System.out.println(((maiorAB + c) + Math.abs (maiorAB - c))/2 +" eh o maior");

    }
}