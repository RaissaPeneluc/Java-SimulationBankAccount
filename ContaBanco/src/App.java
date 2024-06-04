import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cliente, por favor, digite o seu nome:");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência:");
        int num = scanner.nextInt();

        System.out.println("Por favor, digite o nome da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, insira o seu saldo:");
        double saldo = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
