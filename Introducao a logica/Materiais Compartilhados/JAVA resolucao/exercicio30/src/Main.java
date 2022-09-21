import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite o 1 numero");
        n1 = input.nextInt();
        System.out.println("Digite o 2 numero");
        n2 = input.nextInt();
        System.out.println("Digite o 3 numero");
        n3 = input.nextInt();
        if(n1 < n2) {
            if(n2 < n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
            }else if(n1 < n3) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else{
            System.out.println(n3 + " " + n1 + " " + n2);
        }
        }else if(n2 < n3){
            if(n1 < n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        }else {
            System.out.println(n3 + " " + n2 + " " + n1);
        }
    }
}




