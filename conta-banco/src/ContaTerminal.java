import java.util.Scanner; // Importando a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário e obter os dados
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine(); // Lê a agência

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt(); // Lê o número da conta

        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble(); // Lê o saldo

        // Exibir a mensagem de conta criada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! " +
                          "Sua agência é " + agencia + ", conta " + numero + 
                          " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem); // Imprime a mensagem final

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
