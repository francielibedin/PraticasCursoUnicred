package br.com.unicred.exercicios;

import java.math.BigDecimal;
import java.util.Date;

public class ContaCorrenteA1 {

	private int numero;
	private BigDecimal saldo;
	private Date dataAbertura;
	private ClienteA1 cliente;

	//criar o construtor
	public ContaCorrenteA1(BigDecimal saldo) {
//		Op��o 2: A conta corrente somente pode ser debitada se o cliente estiver ativo.
		this.cliente = new ClienteA1();//vou iniciar a variavel 
		
		this.saldo = saldo;			
	}
	
	// Um m�todo privado chamado ValidarSaldo que recebe um par�metro chamado
	// ValorDebito e retorna
	// um booleano indicando que o saldo atual da conta � suficiente para realizar a
	// opera��o ou n�o
	// compareTo valida da seguinte forma: A<B=-1 ou A==B=0 ou A>B=1
	private boolean validarSaldo(BigDecimal valorDebito) {
		if (saldo.compareTo(valorDebito) >= 0) {
			return true;
		}
		return false;
	}

	// Um m�todo p�blico chamado Sacar que recebe um par�metro chamado ValorSaque e
	// retorna um string
	// informando se o saque foi realizado ou n�o. O m�todo Sacar deve acionar o
	// m�todo ValidarSaldo para
	// garantir que o saque somente seja realizado com saldo suficiente.
	// Caso exista saldo suficiente o atributo Saldo deve ser diminu�do com o valor
	// do saque
	public String sacar(BigDecimal valorSaque) {
//		Op��o 2: A conta corrente somente pode ser debitada se o cliente estiver ativo.
//		if (validarSaldo(valorSaque) && cliente.getStatus() == 1) {
		if(cliente.getStatus() == 1) {
			if (validarSaldo(valorSaque)) {
				saldo = saldo.subtract(valorSaque);
				return new String("Saque realizado com sucesso.");
			}
			else {
				return new String("Saldo insuficiente para saque.");
			}
		}
		else {
			return new String("Cliente inativo para realizar saque.");
		}
	}

	// Um m�todo p�blico chamado PagarConta que recebe um par�metro chamado
	// ValorConta e retorna um string
	// informando se o pagamento foi realizado ou n�o. O m�todo PagarConta deve
	// acionar o m�todo ValidarSaldo para
	// garantir que o pagamento somente seja realizado com saldo suficiente.
	// -Caso exista saldo suficiente o atributo Saldo deve ser diminu�do com o valor
	// do pagamento.
	public String pagarConta(BigDecimal valorConta) {
		if (validarSaldo(valorConta)) {
			saldo = saldo.subtract(valorConta);
			return new String("Pagamento realizado com sucesso.");
		}
		return new String("Saldo insuficiente para pagamento.");
	}
	
	public ClienteA1 getCliente() {
		return cliente;
	}

}
