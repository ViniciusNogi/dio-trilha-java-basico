import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Bem-vindo à abertura de conta!");
        System.out.println("Para começar, informe o número da conta:");
        int numero = ler.nextInt();
        ler.nextLine();
        
        System.out.println("Ótimo! Agora informe o número da agência:");
        String agencia = ler.nextLine();

        System.out.println("Agora, informe seu nome completo:");
        String nome = ler.nextLine();

        System.out.println("Por fim, informe o valor do depósito inicial:");
        double saldo = ler.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é R$ %.2f já está disponível para saque",
                nome, agencia, numero, saldo);

        ler.close();
    }
}
