package br.com.unicred.exercicios;

public class ViagemA1Versao2 {
	
	private static final Integer KM_LITRO_RODADO = 12;
	private Integer tempo;
	private Integer velocidade;
	private Integer distancia;
	private Integer velMedia;
	private Integer qtdadeLitrosViagem;
	
	public void calcularDistancia() {
		distancia = tempo * velocidade;
	}

	public void calcularVelocMedia() {
		velMedia = distancia / tempo;
	}

	public void calcularTempoViagem() {
		tempo = distancia / velocidade;
	}

	public void calcularQtdadeLitros() {
		qtdadeLitrosViagem = distancia / KM_LITRO_RODADO;
	}
	
	public Integer getTempo() {
		return tempo;
	}
	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
	public Integer getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	public Integer getDistancia() {
		return distancia;
	}
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
	public Integer getVelMedia() {
		return velMedia;
	}
	public void setVelMedia(Integer velMedia) {
		this.velMedia = velMedia;
	}
	public Integer getQtdadeLitrosViagem() {
		return qtdadeLitrosViagem;
	}
	public void setQtdadeLitrosViagem(Integer qtdadeLitrosViagem) {
		this.qtdadeLitrosViagem = qtdadeLitrosViagem;
	}

	@Override
	public String toString() {
		return "ViagemA1Versao2 [tempo=" + tempo + ", velocidade=" + velocidade + ", distancia=" + distancia
				+ ", velMedia=" + velMedia + ", qtdadeLitrosViagem=" + qtdadeLitrosViagem + "]";
	}
	
	
}
