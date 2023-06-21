import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner getDados = new Scanner(System.in);
        int num1 = getDados.nextInt();
        int num2 = getDados.nextInt();


        System.out.println("PROD = "+ (num1 * num2) );

    }
}