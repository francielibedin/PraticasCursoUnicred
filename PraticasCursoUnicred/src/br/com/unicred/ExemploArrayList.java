package br.com.unicred;

import java.util.LinkedList;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;


public class ExemploArrayList {
	
	public static void main(String[] args) {
//		arraylista usa menos mem�rio que um vetor, mas n�o � thredsafe
		ArrayList<String> nomes = new ArrayList();
//		cria o vetor
//		Vector<String> nomes = new Vector();
		
		
		nomes.add("Gabriela");
		nomes.add("Juliane");
		nomes.add("Lucas");
		nomes.add("Cabelleira");
//		indica a posi��o, isso quando quero add em alguma posi��o especifica
		nomes.add(0,"Gabriela");
		
		System.out.println("Total de itens: " + nomes.size());
		
//		System.out.println("Nome na posi��o 1: " + nomes.get(1));
		
		for (int i=0; i<nomes.size(); i++) {
			System.out.println("Nome na posi��o ("+ i +")" + nomes.get(i));
		}
		
//		s� para deixar espaco no que vai apresentar na tela
		System.out.println();
		
		nomes.remove("Juliane");
		nomes.remove("Francieli");
		nomes.remove("Gabriela");
//		nomes.remove(0);  --se quiser remover por posicao
//		foreach - � o comando que j� entende que � uma lista e ele interage dentro dessa lista, por�m na hr de usar o comando fica como for
		for (String item : nomes) {
//			Gabriela manteve pq ele s� remove um item por vez
			System.out.println("Nome: " +item);
			
		}
	}

}
