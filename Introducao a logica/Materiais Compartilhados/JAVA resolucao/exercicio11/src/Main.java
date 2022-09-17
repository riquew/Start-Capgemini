import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preco de custo do produto: ");
        float precoDeCusto = input.nextFloat();
        System.out.println("Digite a porcentagem para acrescimo no preco de venda : ");
        float porcentagemAcrescimo = input.nextFloat();
        float valorVenda = precoDeCusto + (precoDeCusto / 100) * porcentagemAcrescimo;
        System.out.printf("O valor de venda fo produto e R$%.2f", valorVenda);
    }
}