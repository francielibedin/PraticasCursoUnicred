package br.com.unicred;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	
	public static void main(String[] args) {
	
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("bsi", "Bach em sistema de informa��o");
		map.put("aho", "Administra��o hopitalar");
		map.put("com", "Com�rcio exterior");
		map.put("adm", "Administra��o");
		map.put("aho", "AHO");
		
		System.out.println(map.get ("com"));
		System.out.println(map.get ("xxx"));
		System.out.println(map.get ("aho"));
		
//		OBS: apresenta s� um resultado do id aho, pq ele sobrescreve, s� manda inserir, n�o verifica se j� tem algo l�
	}

}
