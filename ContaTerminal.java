import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        String conta = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + conta);
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: " + saldo);

        scanner.close();
    }
}
