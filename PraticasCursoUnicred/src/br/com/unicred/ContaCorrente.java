package br.com.unicred;

public class ContaCorrente {
    
    protected String numeroConta;
    private double saldo;
    private String titular;
    
    private static int qtdeContas = 0;
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    //public void setNumeroConta (String numeroConta) {
    //    this.numeroConta = numeroConta;
    //}
    
    //retirar este construtor, para ele obrigar a pegar o que implementamos obrigando a informar a conta
    //public ContaCorrente() { //Construtor        
    //}
    
    public ContaCorrente(String numeroConta) { //sobrescrever o Construtor
        this.numeroConta = numeroConta;
        this.saldo = 0;
        qtdeContas++;
    }
    
    public static int getQtdeContas() {
        return qtdeContas;
    }
}
