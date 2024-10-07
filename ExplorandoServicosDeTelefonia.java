import java.util.Scanner;

public class ServicoTelefonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        String servicoProcurado = scanner.nextLine();

        System.out.println(" ");
        String entradaCliente = scanner.nextLine();

        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];

        boolean achouServico = false;
        for (int i = 1; i < partes.length; i++) {
            String servicoContratado = partes[i].trim();
            if (servicoProcurado.equals(servicoContratado)) {
                achouServico = true;
                break;
            }
        }

        if (achouServico) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
