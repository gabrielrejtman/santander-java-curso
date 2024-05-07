import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = inserirConta(scanner);
        String agencia = inserirAgencia(scanner);
        String nomeCliente = inserirNome(scanner);
        double saldoCliente = inserirSaldo(scanner);

        imprimirMensagem(numeroConta, agencia, nomeCliente, saldoCliente);
    }

    public static int inserirConta(Scanner scanner) {
        System.out.println("Insira o número de sua conta bancária: ");
        int novoNumero = scanner.nextInt();
        scanner.nextLine();
        return novoNumero;
    }

    public static String inserirAgencia(Scanner scanner) {
        System.out.println("Insira o número de sua agência: ");
        String novaAgencia = scanner.nextLine();
        return novaAgencia;
    }

    public static String inserirNome(Scanner scanner) {
        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        String nomeCliente = nome.concat(" ").concat(sobrenome);
        return nomeCliente;
    }

    public static double inserirSaldo(Scanner scanner) {
        System.out.println("Deposite seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        return saldo;
    }

    public static void imprimirMensagem(int numeroConta, String agencia, String nomeCliente, double saldoCliente) {
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(", conta ").concat(String.valueOf(numeroConta)).concat(" e seu saldo ")
                .concat(String.valueOf(saldoCliente))
                .concat(" já está disponível");

        System.out.println(mensagem);
    }
}
