package exercicio6;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int varA = leitor.nextInt();
        int varB = leitor.nextInt();
        System.out.printf("O valor digitado em varA = %d, o valor digitado em varB = %d \n", varA, varB);
        int varTemporaria = 0;
        varA = varTemporaria;
        varA = varB;
        varB = varTemporaria;
        System.out.printf("Os valores agora sao varA = %d e varB = %d", varA, varB);
    }
}
