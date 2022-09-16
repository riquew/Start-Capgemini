package exercicio24;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a verificar: ");
        int qtdNumeros = leitor.nextInt();
        while(qtdNumeros > 0) {
            System.out.println("Digite o numero a ser verificado: ");
            int numeroVerificar = leitor.nextInt();
            if(numeroVerificar > 0) {
                System.out.println("Numero digitado e positivo");
            }else if(numeroVerificar < 0) {
                System.out.println("Numero digitado e negativo");
            }else{
                System.out.println("Numero e zero!");
            }
            qtdNumeros --;
        }
    }
}
