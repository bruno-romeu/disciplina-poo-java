import java.util.Scanner;

public class LoginSystem {
    
    public static void main(String args[]) {
        String username = "java8";
        String password = "java8";
        int attempts = 3;

        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("Usuário: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Senha: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                attempts--;
                System.out.println("Usuário ou senha inválidos. \nVocê possui mais " + attempts + " tentativas.");
                if (attempts == 0) {
                    System.out.println("Conta bloqueada. \nSistema Encerrando...");
                }
            }
        }

        scanner.close();
    }
}
