public class ContaTerminal {
    // Atributos privados da classe ContaTerminal
    private int numero; // Número da conta
    private String agencia; // Agência da conta
    private String nomeCliente; // Nome do cliente
    private double saldo; // Saldo da conta

    // Método para definir o número da conta
    public void setNumero(int numero) {
        this.numero = numero; // Atribui o valor do parâmetro ao atributo numero
    }

    // Método para definir a agência da conta
    public void setAgencia(String agencia) {
        this.agencia = agencia; // Atribui o valor do parâmetro ao atributo agencia
    }

    // Método para definir o nome do cliente
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente; // Atribui o valor do parâmetro ao atributo nomeCliente
    }

    // Método para definir o saldo da conta
    public void setSaldo(double saldo) {
        this.saldo = saldo; // Atribui o valor do parâmetro ao atributo saldo
    }

    // Método para imprimir os dados da conta
    public void imprimirDados() {
        // Imprime uma mensagem de boas-vindas ao cliente
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        // Imprime os detalhes da conta, incluindo número, agência e saldo formatado com duas casas decimais
        System.out.println("Sua conta é " + numero + ", agencia " + agencia + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");
    }
}