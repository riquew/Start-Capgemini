package EstruturaCondicionalSe;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade, para saber se voce ja deve se alistar no EB: ");
        int idade = leitor.nextInt();
        if(idade >= 18){
            System.out.println("Procure a junta mais proxima da sua casa");
        } else {
            System.out.println("Voce ainda nao pode se alistar, te vejo em breve");
        }

    }
}
