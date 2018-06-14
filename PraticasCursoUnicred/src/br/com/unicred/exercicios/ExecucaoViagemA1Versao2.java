package br.com.unicred.exercicios;

public class ExecucaoViagemA1Versao2 {
	
	public static void main(String[] args) {
//		Criar a classe Viagem e inicializar ela
		ViagemA1Versao2 viagem = new ViagemA1Versao2();
//		setar as variaveis
		viagem.setVelocidade(80);
		viagem.setDistancia(500);
//		efetuar os calculos
		viagem.calcularTempoViagem();
		viagem.calcularQtdadeLitros();
		viagem.calcularVelocMedia();
		viagem.calcularDistancia();
//		printo os resultados forma 01
		System.out.println("Tempo: " + viagem.getTempo());
		System.out.println("QtdadeLitros: " + viagem.getQtdadeLitrosViagem());
		System.out.println("VelocMedia: " + viagem.getVelMedia());
		System.out.println("Distancia: " + viagem.getDistancia());
//		printo os resultados forma 02
//		Para esta forma é necessario adicionar a o metodo toString dentro da classe viagem
		System.out.println(viagem.toString());
		
	}
}
