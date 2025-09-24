import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Digite o número para visualizar a sua tabuada: ");
        number = scanner.nextInt();

        for(int i = 1; i<11; i++) {
            int calc = i * number;
            System.out.printf("%s x %s é igual a: %s.\n", i, number, calc);
        }

        scanner.close();
    }
}
