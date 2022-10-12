// Cria e manipula um objeto ContaBancaria.
import java.util.Locale;
import java.util.Scanner;

public class ContaBancariaTest
{
	public static void main(String[] args)
	{
		/// cria um objeto ContaBancaria e o atribui a myContaBancaria
		 ContaBancaria myContaBancaria1 = new ContaBancaria("Conta de Campanha", 50.00);
		 ContaBancaria myContaBancaria2 = new ContaBancaria("Conta de Caixa 2", -7.53);

		 //Saldo e depósito conta bancária 1
		 mostraConta(myContaBancaria1);
		 depositoConta(myContaBancaria1);

		 //Saldo e depósito conta bancária 2
		 mostraConta(myContaBancaria2);
		 depositoConta(myContaBancaria2);

	 }

	 public static void mostraConta(ContaBancaria conta) {
		 System.out.printf("Saldo da conta %s : R$ %.2f %n%n", conta.getName(), conta.getSaldo());
	 }

	public static void depositoConta(ContaBancaria conta) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		System.out.printf("Entre o valor a depositar pra conta %s: ", conta.getName());
		float valorDeposito = input.nextFloat();
		System.out.printf("%nAdicionando o valor R$ %.2f no saldo da %s %n%n", valorDeposito, conta.getName());
		conta.deposito(valorDeposito);
		mostraConta(conta);
	}
 } // fim da classe ContaBancariaTest