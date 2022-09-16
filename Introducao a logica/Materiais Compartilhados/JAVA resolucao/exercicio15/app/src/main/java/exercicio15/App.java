package exercicio15;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = leitor.nextInt();
        if(numero >= 100 && numero <= 200){
            System.out.println("O numero digitado " + numero + " , esta dentro do intervalo de 100 a 200.");
        } else {
            System.out.println("O numero digitado " + numero + " , nao esta dentro do intervalo de 100 a 200.");
        }
        
    }
}
