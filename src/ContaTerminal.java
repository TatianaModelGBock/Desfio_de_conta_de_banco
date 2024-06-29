import java.util.Scanner;

    public class ContaTerminal {
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Por favor, digite o número da Agẽncia: ");
            String Agencia = sc.nextLine();
            System.out.println("Por favor, digite o número da conta: ");
            int numerodaconta = sc.nextInt();
            sc.nextLine(); // pular linha

            System.out.println("Por favor, digite o seu nome: ");
            String nomeCliente = sc.nextLine();

            System.out.println("Por favor, digite o  Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "
                    + "Sua agência é " + Agencia + ", conta " + numerodaconta + " e seu saldo " + saldo + " já está disponível para saque.");

            sc.close();
        }
    }


