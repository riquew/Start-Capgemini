package exercicio4;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o nome do vendedor? ");
        String nomeVendedor = leitor.nextLine();
        System.out.println("Qual o salario desse vendedor? ");
        double salarioVendedor = Double.parseDouble(leitor.next());
        System.out.println("Qual o total de vendas em reais que ele efetuou? ");
        double vendasEfetuadas = Double.parseDouble(leitor.next());
        double comissaoVendedor = (vendasEfetuadas/100) * 15;
        double salarioFinal = salarioVendedor + comissaoVendedor;
        System.out.printf("O vendedor %s, tera o salario"
                + " final do mes de %.2f apos o acrescimo no valor de %.2f de comissao."
                , nomeVendedor, salarioFinal, comissaoVendedor);
    }
}
