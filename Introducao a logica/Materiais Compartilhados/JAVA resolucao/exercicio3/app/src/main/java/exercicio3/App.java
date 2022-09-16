package exercicio3;
import java.util.Scanner;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual foi a distancia percorrida pelo veiculo em km? ");
        float distanciaPercorrida = Float.parseFloat(leitor.next());
        System.out.println("Qual foi a quantidade gasta de combustivel em L? ");
        float combustivelGasto = Float.parseFloat(leitor.next());
        float mediaDeConsumo = distanciaPercorrida / combustivelGasto;
        System.out.printf("A media de consumo de combvustivel e %.2f km/L.", mediaDeConsumo);
    }
}
