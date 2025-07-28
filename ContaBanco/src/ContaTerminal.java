import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        // Apresentação inicial para o usuário
        System.out.println("============== TERMINAL DE CONTAS ==============");
        System.out.println("        Bem-vindo ao Terminal de Contas!        ");
        System.out.println("================================================");

        // Importação da classe scanner para entrada de dados
        var scanner = new Scanner(System.in);

        // Entrada de dados - solicitação ao usuário que insira informações pessoais e de sua conta
        // Leitura e processamento da entrada do usuário
        System.out.println("Por favor, informe o nome do titular da conta:");
        String nome = scanner.nextLine();
        System.out.println("Por favor, informe o número da conta:");
        String conta = scanner.nextLine();
        System.out.println("Por favor, informe a agência:");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, informe o saldo atual da conta:");
        double saldo = scanner.nextDouble();
        System.out.println("================================================");
        System.out.println("\n");

        // Fechamento do scanner para evitar vazamento de recursos
        scanner.close();

        // Saída de dados - exibição das informações inseridas pelo usuário através do terminal
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\n", nome);
        System.out.printf("Sua agência é %d, conta %s e seu saldo de R$ %.2f já está disponível para saque.\n", agencia, conta, saldo);
        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("        Obrigado por usar nosso Terminal!       ");
        System.out.println("================================================");
    }
}
