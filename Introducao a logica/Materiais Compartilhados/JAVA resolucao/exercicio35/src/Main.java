import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de Kwh: ");
        float kwh = input.nextFloat();
        System.out.println("Digite 1(Residencia), 2(Comercio) ou 3(Industria): ");
        int tipoImovel = input.nextInt();
        while(tipoImovel < 1 || tipoImovel > 3){
            System.out.println("Valor invalido");
            System.out.println("Digite 1(Residencia), 2(Comercio) ou 3(Industria): ");
            tipoImovel = input.nextInt();
        }
        float valorConta = 0;
        if(tipoImovel == 1) {
            valorConta = 0.6f * kwh;
        } else if(tipoImovel == 2)  {
            valorConta = 0.48f * kwh;
        } else {
            valorConta = 1.29f * kwh;
        }
        System.out.printf("O valor a ser pago e R$%.2f", valorConta);
    }
}