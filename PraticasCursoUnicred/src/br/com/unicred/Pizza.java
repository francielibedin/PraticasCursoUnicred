package br.com.unicred;

public abstract class Pizza { //abstract = n�o pode ser instanciada, sei que tem que fazer mas n sei o q

    private String tipoMassa;
    private String tamanho;
    
    protected String temperos;
    
    public abstract void temperar();//morre aqui, pq a constru��o dele � feita na classe filha
}
