import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Considerando salario minimo em R$ 1000,00
        float salarioMinimo = 1000;
        for(int i = 0; i < 584; i ++) {

            System.out.println("Digite o salario do funcionario: ");
            float salarioFuncionario = input.nextFloat();
            float reajuste = 0;
            if(salarioFuncionario < (3 * salarioMinimo)) {
                reajuste = (salarioFuncionario * 50) / 100;
            } else if(salarioFuncionario <= (10 * salarioMinimo)) {
                reajuste = (salarioFuncionario * 20) / 100;
            } else if(salarioFuncionario  <= (20 * salarioMinimo)) {
                reajuste = (salarioFuncionario * 15) / 100;
            } else {
                reajuste = (salarioFuncionario * 10) / 100;
            }
        float salarioReajustado = salarioFuncionario + reajuste;
        System.out.printf("O salario do funcionario era R$%.2f, teve um reajuste de R$%.2f, indo para R$%.2f\n", salarioFuncionario, reajuste, salarioReajustado);

        }

        // Considerando salario minimo em R$ 1000,00

    }
}