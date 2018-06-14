package br.com.unicred;

public abstract class Pizza { //abstract = não pode ser instanciada, sei que tem que fazer mas n sei o q

    private String tipoMassa;
    private String tamanho;
    
    protected String temperos;
    
    public abstract void temperar();//morre aqui, pq a construção dele é feita na classe filha
}
