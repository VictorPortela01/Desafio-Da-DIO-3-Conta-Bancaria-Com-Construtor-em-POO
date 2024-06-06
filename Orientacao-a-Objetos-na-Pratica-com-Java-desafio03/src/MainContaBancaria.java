
import java.util.Scanner;

public class MainContaBancaria {
 /**
     * <h1>Orientação a Objetos na Prática com Java</h1>
     * Desafio de código 3 / 5  da DIO - Conta Bancária com Construtor em POO
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Victor Portela
     * @version 1.0
     * @since   06/06/2024
     */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque feito.");
            imprimirSaldo();
        } else{
            System.out.println("Saque nao realizado.");
            System.out.println("Saldo insuficiente.");
        }
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}
