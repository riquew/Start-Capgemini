package EstruturaWhile;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int totalAlunos = 4;
        Scanner leitorScanner = new Scanner(System.in);
        while(totalAlunos > 0){
            
            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = leitorScanner.nextLine();
            System.out.println("Digite a idade do aluno: ");
            int idade = leitorScanner.nextInt();
            System.out.println("Digite a media do aluno: ");
            float media = Float.parseFloat(leitorScanner.next());
            System.out.println("O aluno " + nomeAluno + " tem " + idade +
                    " anos, e sua media foi de " + media);
            leitorScanner.nextLine();
            totalAlunos --;
        }
    }
}
