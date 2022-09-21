import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nivel do professor: ");
        int nivel = input.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horas = input.nextInt();
        float salario = 0;
        if(nivel == 1) {
            salario = 12 * horas;
        } else if(nivel == 2) {
            salario  = 17 * horas;
        } else if(nivel == 3) {
            salario = 25 * horas;
        } else {
            System.out.println("Nivel digitado nao e valido.");
        }
        System.out.printf("O salario do professor e R$%.2f", salario);
    }
}