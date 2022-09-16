package exercicio26;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continua = true;
        while(continua) {
                System.out.println("Digite um numero de 1 a 5, e 0 para encerrar: ");
        int numero = leitor.nextInt();
        switch(numero) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 0:
                System.out.println("Encerrando o programa.");
                continua = false;
                break;
            default:
                System.out.println("NUMERO INVALIDO");
                break;    
        }
        
        }
    }
}
