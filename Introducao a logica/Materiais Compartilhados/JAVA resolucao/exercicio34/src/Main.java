import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do nadador: ");
        int idade = input.nextInt();
        if(idade < 8) {
            System.out.println("Infantil A");
        } else if(idade < 11) {
            System.out.println("Infantil B");
        } else if(idade < 14) {
            System.out.println("Juvenil A");
        } else if(idade < 18) {
            System.out.println("Juvenil B");
        } else {
            System.out.println("Senior");
        }
    }
}