package Classes;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Pessoa objetoPessoa = new Pessoa(100, 2);
        
        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.printf("O Imc da pessoa e %.2f ", objetoPessoa.calcularIMC());
    }
}
