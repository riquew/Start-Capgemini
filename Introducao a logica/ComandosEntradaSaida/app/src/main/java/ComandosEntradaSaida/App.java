package ComandosEntradaSaida;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        // algum erro quando imprimo o double ou float, usando o nextFloat ou nextDOuble
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Digite a cotacao do dolar: ");
        float cotacaoDolar = Float.parseFloat(leitor.next());
        System.out.println("Ola " + nome + "voce tem " + idade + " anos");
        System.out.println("A cotacao do dolar hoje e de " + cotacaoDolar);
    }
}
