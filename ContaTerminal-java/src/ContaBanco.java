import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String agencia = "067-8";

        System.out.println("Por favor, insira o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Inserir nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, "+ nomeCliente + ", obrigado pelo cadastro em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


        scanner.close();


        
    }
}
