package exercicio16;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite a 1 nota: ");
        float nota1 = Float.parseFloat(leitor.next());
        System.out.println("Digite a 2 nota: ");
        float nota2 = Float.parseFloat(leitor.next());
        System.out.println("Digite a 3 nota: ");
        float nota3 = Float.parseFloat(leitor.next());
        float media = (nota1 + nota2 + nota3)/3;
        if(media >= 7) {
            System.out.println("Media: "+ media + "\n" + "APROVADO!");
        } else if(media>= 5.1 && media <= 6.9) {
            System.out.println("Media: "+ media + "\n" + "RECUPERACAO");
        } else {
            System.out.println("Media: "+ media + "\n" + "REPROVADO");
        }
    }
}
