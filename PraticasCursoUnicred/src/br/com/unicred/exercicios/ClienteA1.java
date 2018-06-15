package br.com.unicred.exercicios;

import java.math.BigDecimal;
import java.util.Date;

public class ClienteA1 {
	
	private int codigo;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private Short status;
	
	public static void main(String[] args) {
//		Através do método main, instanciar a classe ContaCorrente, com um saldo inicial (na classe 
//		contacorrente vou criar o construtor recebendo o saldo inicial), 
//      "new ContaCorrenteA1()" essa parte do comando diz que estou chamando o construtor
//		ContaCorrenteA1 contaCorrente = new ContaCorrenteA1(new BigDecimal(0));
//		ou 
		ContaCorrenteA1 contaCorrente = new ContaCorrenteA1(BigDecimal.ZERO);
//		intaivar o cliente para testar a opção cliente inativo
		contaCorrente.getCliente().inativar();
		
	
//		Opção 1: A conta corrente somente pode ser debitada se o cliente estiver ativo.
//		ClienteA1 cliente = new ClienteA1();
		//		if() {
//			System.out.println(contaCorrente.sacar(BigDecimal.TEN));
//		}
		
//		e acionar os métodos Sacar e PagarConta de forma a verificar se as verificações estão 
//		ocorrendo corretamente.		
		System.out.println(contaCorrente.sacar(BigDecimal.TEN));
		System.out.println(contaCorrente.pagarConta(BigDecimal.ONE));
	}

	
	
	
//	O Status do cliente deve "nascer" como um (1) (ativo).
//	public ClienteA1(Short status) {//construtor
//		this.status = status;		
//	}
//	ou
////	cosntrutor abaixo é a melhor forma, pois estou garantindo que está iniciando ativo, o construtor acima
//	só estou guardando o status
	public ClienteA1() {//construtor
		ativar();		
	}
//	Criar um método Inativar no cliente que muda o Status para zero (0) (inativo)
	private void inativar() {
		this.status = 0;
//		ou
//		this.status = new Short("0");
	}
//	Criar um método Ativar no cliente que muda o Status para um (1) (ativo)
	private void ativar() {
		this.status = 1;
	}
	public Short getStatus() {
		return status;
	}
	
}
