package br.com.unicred;

public class ContaEspecial extends ContaCorrente {
    
    public double limite;
    
    public ContaEspecial (String numeroConta, double limite) {
        super(numeroConta);
        //limite = 0;
        this.limite = limite;
    }
}
