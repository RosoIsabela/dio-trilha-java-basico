import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numerodaConta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Saldo: ");
        float saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nomeCliente, agencia, numerodaConta, saldo);

        sc.close();
    }
}
