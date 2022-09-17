import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        if(numero1 > numero2) {
            System.out.println("O primeiro numero digitado e maior que o segundo.");
        } else if(numero1 < numero2) {
            System.out.println("O segundo numero digitado e maior que o primeiro");
        } else {
            System.out.print("Os valores digitados sao iguais.");
        }

    }
}