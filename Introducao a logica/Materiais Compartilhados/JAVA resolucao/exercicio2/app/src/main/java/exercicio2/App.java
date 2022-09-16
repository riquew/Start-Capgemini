package exercicio2;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            float numero1 = Float.parseFloat(leitor.next());
            System.out.println("Digite outro numero: ");
            float numero2 = Float.parseFloat(leitor.next());
            float soma = numero1 + numero2;
            float subtracao = numero1 - numero2;
            float divisao = numero1 / numero2;
            float multiplicacao = numero1 * numero2;
            System.out.println("A soma dos valores digitados e igual a " + soma);
            System.out.println("A subtracao dos valores digitados e igual a " + subtracao);
            System.out.println("A divisao dos valores digitados e igual a " + divisao);
            System.out.println("A multiplicao dos valores digitados e igual a " + multiplicacao);
    }
}
