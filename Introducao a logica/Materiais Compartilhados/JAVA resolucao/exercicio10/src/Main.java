import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        float valorProduto = input.nextFloat();
        System.out.println("O valor das prestacoes e igual a " + valorProduto / 5);
    }
}