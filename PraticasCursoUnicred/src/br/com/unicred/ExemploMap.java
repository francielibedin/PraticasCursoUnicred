package br.com.unicred;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	
	public static void main(String[] args) {
	
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("bsi", "Bach em sistema de informação");
		map.put("aho", "Administração hopitalar");
		map.put("com", "Comércio exterior");
		map.put("adm", "Administração");
		map.put("aho", "AHO");
		
		System.out.println(map.get ("com"));
		System.out.println(map.get ("xxx"));
		System.out.println(map.get ("aho"));
		
//		OBS: apresenta só um resultado do id aho, pq ele sobrescreve, só manda inserir, não verifica se já tem algo lá
	}

}
