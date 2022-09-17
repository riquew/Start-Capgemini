import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de producao do carro: ");
        float custoFabrica = input.nextFloat();
        float valorComImposto = custoFabrica * 1.45f;
        float valorDistribuidor = valorComImposto * 1.28f;
        System.out.printf("O valor final do carro para o consumidor sera R$%.2f", valorDistribuidor);
    }
}