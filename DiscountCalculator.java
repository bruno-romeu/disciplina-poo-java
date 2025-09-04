import java.util.Scanner;


public class CalcDesc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double value, discount;

        System.out.println("Digite um valor: ");
        value = scanner.nextDouble();

        System.out.println("Digite a porcentagem do desconto: ");
        discount = scanner.nextDouble();

        double calc = value * (discount / 100);

        double finalValue = value - calc;

        System.out.println("Valor total: R$" + value);
        System.out.println("Desconto aplicado: R$" + discount + "%");
        System.out.println("Valor do desconto: R$" + calc); 
        System.out.println("Valor Final com Desconto Aplicado: R$" + finalValue);


    }
}