import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        float numero = input.nextFloat();
        if(numero > 10) {
            System.out.println("Valor digitado maior que 10!");
        } else {
            System.out.println("valor digitado menor ou igual a 10.");
        }
    }
}