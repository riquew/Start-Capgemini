package exercicio5;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nomeAluno = leitor.nextLine();
        float somaNotas = 0;
        for(int i = 1; i<=3; i++) {
            System.out.printf("Digite a %dª nota do aluno %s: ", i, nomeAluno);
            float notaAluno = leitor.nextInt();
            somaNotas += notaAluno;
        }
        float mediaNotasAluno = somaNotas / 3;
        System.out.printf("A media do aluno %s e igual %.2f",nomeAluno, mediaNotasAluno);
    }
}
