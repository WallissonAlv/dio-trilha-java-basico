import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // O programa solicitará ao usuário que informe o saldo inicial da conta.
        // Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.
       
        double saldo = scanner.nextDouble(); 								// 100 
        int quantidadeTransacoes = scanner.nextInt();						// 2
        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);					// d
            double valorTransacao = scanner.nextDouble();					// 10

            transacoes.add(new Transacao(tipoTransacao, valorTransacao));
            
            if ((tipoTransacao == 'D')||(tipoTransacao == 'd')) {
                saldo += valorTransacao;
            } else if ((tipoTransacao == 'S')||(tipoTransacao == 's')) {
                saldo -= valorTransacao;
            }
        }

       // TODO: Formatar a Saída (tipo e valor) de acordo com os Exemplos.
        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");
        
        transacoes.stream()
        	.map(transacao -> transacao.getTipo()+" de "+ transacao.getValor())
            .collect(Collectors.toList())
            .forEach(System.out::println);

        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}