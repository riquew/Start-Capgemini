import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor a ser depositado: ");
        float valorDepositado = input.nextFloat();
        float valorAposUmMes = valorDepositado * 1.07f;
        System.out.printf("O novo valor apos um mes e R$%.2f", valorAposUmMes);

    }
}