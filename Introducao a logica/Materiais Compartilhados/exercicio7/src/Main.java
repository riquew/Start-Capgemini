import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        float temperaturaCelsius = leitor.nextFloat();
        float temperaturaFahrenheit = (temperaturaCelsius * 9 + 160) / 5;
        System.out.println("A temperatura digitada em Celsius e igual a " + temperaturaFahrenheit + " Fahrenheit.");
    }
}
