import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner getDados = new Scanner(System.in);
        float numx1 = getDados.nextFloat();
        float numy1 = getDados.nextFloat();
        float numx2 = getDados.nextFloat();
        float numy2 = getDados.nextFloat();

        float calculo = (numx2 - numx1)*(numx2 - numx1) + (numy2 - numy1)*(numy2 - numy1);


        System.out.println(String.format("%.4f", Math.sqrt(calculo)));

    }
}