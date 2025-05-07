import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner prompt = new Scanner(System.in);
        int numeroConta = 0;
        String agencia = "0";
        String nomeCliente = "0";
        double saldo = 0.0;
        boolean dadosInvalidos = true;

        System.out.println("Olá, bem vindo a criação de uma conta bancaria, digite abaixo as informações pedidas!");

        System.out.println("Digite o número da sua conta (4 digitos): ");
        numeroConta = prompt.nextInt();

        System.out.println("Digite o número da sua agência (4 Digitos com um hifen ex: 123-4): ");
        agencia = prompt.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = prompt.next();

        System.out.println("Digite o valor do depósito inicial (valor abaixo de 2000.00 reais): ");
        saldo = prompt.nextDouble();
        while (dadosInvalidos) {
            if (saldo > 2000.00 || saldo < 0) {
                System.out.println("Valor inválido, o valor dever ser menor que 2000,00 e maior que 0 reais");
                saldo = prompt.nextDouble();
            } else if (agencia.length() > 5) {
                System.out.println("Número da agência inválido, o número deve ter 4 digitos");
                agencia = prompt.next();
            } else if (numeroConta < 1000) {
                System.out.println("Número da conta inválido, o número deve ter 4 digitos");
                numeroConta = prompt.nextInt();
            } else if (nomeCliente.length() > 20) {
                System.out.println("Nome inválido, o nome deve ter no máximo 20 caracteres");
                nomeCliente = prompt.next();
            } else {
                System.out.println("Dados válidos, conta criada com sucesso!");
                dadosInvalidos = false;
            }
        }
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        prompt.close();
    }
}