import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Olá, por favor digite o nome completo: ");
        nomeCliente = Teclado.nextLine();

        System.out.println("Digite o número da conta: ");
        numero = Teclado.nextInt();

        System.out.println("Digite a agência da conta: ");
        agencia = Teclado.next();

        /*  Não entendi muito bem o que eu deveria fazer com esta etapa, portanto pedi para que o usuario
            digitasse o seu saldo disponível */

        System.out.println("Digite o saldo disponível");
        saldo = Teclado.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua Agência é "+agencia+", conta "+numero+", seu saldo disponível para saque é este R$"+saldo);
    }
}