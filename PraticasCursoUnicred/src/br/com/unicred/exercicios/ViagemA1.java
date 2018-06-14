package br.com.unicred.exercicios;

public class ViagemA1 {
	/*
	 * Quantidade de litros de combustivel consumidos em uma viagem com automovel
	 * que faz 12 km por litro
	 */

	private int qtdadeLitrosViagem;
	private static int kmLitroAut = 12;
	private int tempo;
	private int velocidade;
	private int distancia;
	private int velMedia;

	public ViagemA1() {// construtor
	}

	public int calcularDistancia(int tempo, int velocidade) {// metodo
		this.tempo = tempo;
		this.velocidade = velocidade;
		distancia = tempo * velocidade;
		return distancia;
	}

	public int calcularVelocMedia(int distancia, int tempo) {
		this.distancia = distancia;
		this.tempo = tempo;
		velMedia = distancia / tempo;
		return velMedia;
	}

	public int calcularTempoViagem(int velocidade, int distancia) {
		this.velocidade = velocidade;
		this.distancia = distancia;
		tempo = distancia / velocidade;
		return tempo;
	}

	public int calcularQtdadeLitros(int distancia, int kmLitroAut) {
		this.distancia = distancia;
		this.kmLitroAut = kmLitroAut;
		qtdadeLitrosViagem = distancia / kmLitroAut;
		return qtdadeLitrosViagem;
	}

	public int getQtdadeLitrosViagem() {
		return qtdadeLitrosViagem;
	}

	public int getTempo() {
		return tempo;
	}

	public int getDistancia() {
		return distancia;
	}

	public int getVelMedia() {
		return velMedia;
	}

}
