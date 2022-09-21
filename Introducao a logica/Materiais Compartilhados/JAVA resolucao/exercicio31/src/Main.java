import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        float a = input.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float b = input.nextFloat();
        System.out.println("Digite o operador matematico: ");
        char operador = input.next().charAt(0);
        if(operador == '/' && b == 0) {
            System.out.println("Nao e possivel dividir por 0!");
        }else if(operador != '/' && operador != '*' && operador != '+' && operador != '-' ) {
            System.out.println("Operador invalido");
        } else {
            if(operador == '+') {
                System.out.println(a + b);
            } else if(operador == '-') {
                System.out.println(a - b);
            } else if(operador == '*') {
                System.out.println(a * b);
            } else {
                System.out.println(a / b);
            }
        }
    }
}