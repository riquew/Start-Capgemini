import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Vendedor v = new Vendedor();
        v.setCpf("40436439859");
        v.setNome("Henrique de Rossi Windlin");
        v.setSalario(4500f);
        v.setComissaoPorItem(0.1f);
        System.out.println("Qual a quantidade de itens vendidas esse mes? ");
        v.setTotalItensVendidos(leitor.nextInt());

        System.out.printf("O vendedor %s CPF: %s, vendeu %d itens e seu salario foi de R$%.2f",
                v.getNome(), v.getCpf(),v.getTotalItensVendidos(), v.calcularSalario());
    }
}