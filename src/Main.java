import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        String password = "maedomato";
        while(x == 0) {
            System.out.println("Digite sua senha: ");
            Scanner scanner = new Scanner(System.in);
            String pass = scanner.nextLine();

            if (password.equals(pass)) {
                System.out.println("Senha correta, Bem vindo!");
                x = 1;
            } else {
                System.out.println("senha incoreta");
                x = 0;
            }
        }
    }
}