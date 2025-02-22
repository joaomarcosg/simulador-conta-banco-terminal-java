import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String clientName = scanner.next();

        System.out.println("Digite o número da agência: ");
        String agencyNumber = scanner.next();

        System.out.println("Digite o número da conta: ");
        int countNumber = scanner.nextInt();

        System.out.println("Digite seu saldo em conta: ");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é: " + agencyNumber + " conta: " + countNumber);
        System.out.println("E seu saldo R$: " + balance + " Já está disponível para saque.");


    }
}
