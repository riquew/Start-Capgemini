import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a cotacao do dolar: ");
        float cotacaoDolar = input.nextFloat();
        System.out.println("Digite o valor em dolar a ser convertido em reais: ");
        float dolarParaConverter = input.nextFloat();
        float valorConvertidoEmReal = dolarParaConverter * cotacaoDolar;
        System.out.printf("O valor U$%.2f foi convertido em R$%.2f", dolarParaConverter, valorConvertidoEmReal);
    }
}