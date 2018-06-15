package br.com.unicred.ajuda;

//Isso é uma classe
public class ExemploClasse {
	//isso é uma delaração de uma (variavel ou atributo) de um tipo Objeto
	private Integer objeto;
	//isso é uma delaração de uma (variavel ou atributo) de um tipo Primitivo
	private int primitivo;

	//isso é um Construtor que recebe (variavel ou atributo) ao ser inicializado(new ExemploClasse(primitivo, inteiro)  )
	public ExemploClasse(int primitivo, Integer objeto) {
		this.primitivo = primitivo;
		this.objeto = objeto;
	}
	//isso é um construtor inicializado vazio(new ExemploClasse()  )
	public ExemploClasse() {
		
	}
	// exemplo metodo que não retorna nada e não recebe nada
	public void exemploMetodo() {
		
	}
	
	// exemplo metodo que não retorna nada e recebe algo
	public void exemploMetodo2(String argumento) {
		System.out.println("Executa alguma ação com o argumento");
	}
	
	// exemplo metodo que retorna alguma (variavel ou atributo) e não recebe nada
	public String exemploMetodoReturn() {
		return "Retorno algum valor do tipo String";
	}

	// exemplo metodo que retorna alguma (variavel ou atributo) e recebe algo
	public String exemploMetodoReturn2(String argumento) {
		System.out.println("Executa alguma ação com o argumento");
		return "Retorno algum valor do tipo String";
	}
	
	// o get serve para retorna a (variavel ou atributo) porque ela esta declarada como private
	public Integer getObjeto() {
		return objeto;
	}
	
	// o set serve para inserir algo na (variavel ou atributo) porque ela esta declarada como private
	public void setObjeto(Integer objeto) {
		this.objeto = objeto;
	}
	
	
}
