import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente = "";
        String agencia = "";
        int numeroConta = 0;
        float saldo = 0.00F;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a consulta da conta bancária! \n");
        System.out.println("Por favor, digite o número da sua conta:");
        numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("\n Agora, digite a sua agência (xxx-x):");
        agencia = scanner.nextLine();

        System.out.println("\n Digite seu nome em seguida");
        nomeCliente = scanner.nextLine();

        System.out.println("\n E por fim, digite o saldo da sua conta (os centavos são separados por ponto)");
        saldo = Float.parseFloat(scanner.nextLine());

        System.out.println("\n Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numeroConta)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque"));

    }
}
