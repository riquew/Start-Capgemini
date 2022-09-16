package exercicio25;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        float numero1 = leitor.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float numero2 = leitor.nextFloat();
        if(numero1 == numero2) {
            System.out.println("Os numeros digitados sao iguais");
        } else {
            if(numero1 > numero2) {
                System.out.println("O numero " + numero1 + 
                        " e maior que o " + numero2 + ".");
            } else {
                System.out.println("O numero " + numero2 + 
                        " e maior que o " + numero1 + ".");
            }
        }
        
    }
}
