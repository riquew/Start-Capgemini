package exercicio27;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tipoCombustivel;
        do {
            System.out.println("Digite o tipo de combustivel do veiculo: ");
            System.out.println("1-Gasolina \n 2-Alcool \n 3-Diesel");
            tipoCombustivel = leitor.nextInt();
        } while(tipoCombustivel < 1 || tipoCombustivel > 3);
        
        System.out.println("Digite o valor do veiculo: ");
        float valorCarro = Float.parseFloat(leitor.next());
        float valorDesconto;
        if(tipoCombustivel == 1){
            valorDesconto = (valorCarro/100) * 21;
        }else if(tipoCombustivel == 2) {
            valorDesconto = (valorCarro/100) * 25;
        } else {
            valorDesconto = (valorCarro/100) * 14;
        }
        
        float valorCarroComDesconto = valorCarro - valorDesconto;
        
        System.out.println("O valor do carro com desconto e " + valorCarroComDesconto);
        
    }
}
