import java.text.DecimalFormat;
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

        // Exibe a mensagem de conta criada com o saldo formatado
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!%nSua agência é %s, conta %d e seu saldo R$%s já está disponível para saque.", nomeCliente, agencia, numero, df.format(saldo));

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}