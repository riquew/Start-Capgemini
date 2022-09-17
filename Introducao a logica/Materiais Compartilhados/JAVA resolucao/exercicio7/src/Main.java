import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float temperaturaCelsius = input.nextFloat();
        float temperaturaFahrenheit = (temperaturaCelsius * 9 + 160) / 5;
        System.out.printf("A temperatura em Celsius convertida para Fahrenheit e igual a %.2f", temperaturaFahrenheit);
    }
}