import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l1, l2, l3;
        System.out.println("Digite o tamanho do 1 lado: ");
        l1 = input.nextInt();
        System.out.println("Digite o tamanho do 2 lado: ");
        l2 = input.nextInt();
        System.out.println("Digite o tamanho do 3 lado: ");
        l3 = input.nextInt();
        if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1 ) {
            if(l1 == l2 && l2 == l3) {
                System.out.println("Triangulo equilatero.");
            } else if(l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triangulo isosceles.");
            } else {
                System.out.println("Triangulo escaleno.");
            }
        }
        else{
            System.out.println("Nao e triangulo.");
        }

    }
}