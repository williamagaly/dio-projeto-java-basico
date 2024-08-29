import java.util.Scanner;
import java.util.Locale;

public class Usuario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário, configurado para o formato de números dos EUA
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Cria uma nova instância da classe ContaTerminal
        ContaTerminal conta = new ContaTerminal();

        // Exibe uma mensagem de boas-vindas
        System.out.println("Bem-vindo ao Banco DIO!");

        // Variável para armazenar o número da conta
        int numero = 0;
        // Loop para garantir que o usuário insira um número de conta válido
        while (true) {
            try {
                // Solicita ao usuário que digite o número da conta
                System.out.print("Por favor, digite o número da Conta: ");
                // Lê a entrada do usuário e tenta converter para um inteiro
                numero = Integer.parseInt(scanner.nextLine());
                // Se a conversão for bem-sucedida, sai do loop
                break;
            } catch (NumberFormatException e) {
                // Se a conversão falhar, exibe uma mensagem de erro e repete o loop
                System.out.println("Número de conta inválido. Tente novamente.");
            }
        }
        // Define o número da conta na instância de ContaTerminal
        conta.setNumero(numero);

        // Solicita ao usuário que digite o número da agência
        System.out.print("Agora, digite o número da Agência: ");
        // Lê a entrada do usuário e define na instância de ContaTerminal
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

        // Solicita ao usuário que digite o nome do cliente
        System.out.print("Digite o nome do Cliente: ");
        // Lê a entrada do usuário e define na instância de ContaTerminal
        String nomeCliente = scanner.nextLine();
        conta.setNomeCliente(nomeCliente);

        // Variável para armazenar o saldo inicial
        double saldo = 0;
        // Loop para garantir que o usuário insira um valor de saldo válido
        while (true) {
            try {
                // Solicita ao usuário que digite o saldo inicial
                System.out.print("Digite o saldo inicial (use ponto para decimais): ");
                // Lê a entrada do usuário e tenta converter para um double
                saldo = Double.parseDouble(scanner.nextLine());
                // Se a conversão for bem-sucedida, sai do loop
                break;
            } catch (NumberFormatException e) {
                // Se a conversão falhar, exibe uma mensagem de erro e repete o loop
                System.out.println("Valor de saldo inválido. Tente novamente.");
            }
        }
        // Define o saldo inicial na instância de ContaTerminal
        conta.setSaldo(saldo);

        // Chama o método para imprimir os dados da conta
        conta.imprimirDados();

        // Fecha o objeto Scanner
        scanner.close();
    }
}