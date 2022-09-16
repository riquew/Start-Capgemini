package exercicio22;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double somaPrecoDeCusto = 0.0d;
        double somaPrecoDeVenda = 0.0d;
        int contador = 0;
        for(int i = 0; i < 40; i++) {
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = leitor.nextLine();
            System.out.println("Digite o preco de custo do produto: ");
            double precoDeCustoProduto = Double.parseDouble(leitor.next());
            System.out.println("Digite o preco de venda do produto: ");
            double precoDeVendaProduto = Double.parseDouble(leitor.next());
            leitor.nextLine();
            if(precoDeCustoProduto < precoDeVendaProduto) {
                System.out.println("Lucro");
            }else if(precoDeCustoProduto > precoDeVendaProduto) {
                System.out.println("Prejuizo");
            }else {
                System.out.println("Empate");
            }
            somaPrecoDeCusto += precoDeCustoProduto;
            somaPrecoDeVenda += precoDeVendaProduto;
            contador ++;
        }
        double mediaPrecoDeCusto = somaPrecoDeCusto / contador;
        double mediaPrecoDeVenda = somaPrecoDeVenda / contador;
        System.out.println("A media do preco de custo e " + mediaPrecoDeCusto);
        System.out.println("A media do preco de venda e " + mediaPrecoDeVenda);
    }
}
