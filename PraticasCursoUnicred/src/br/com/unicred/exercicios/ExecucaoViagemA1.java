package br.com.unicred.exercicios;

public class ExecucaoViagemA1 {

	public static void main(String[] args) {

		ViagemA1 objViagemA1; // criei a minha viagem
		objViagemA1 = new ViagemA1();// estou add uma viagem no meu obj

		objViagemA1.calcularDistancia(2, 80);
		System.out.println("A distância percorrida é: " + objViagemA1.getDistancia() + " Km.");

		objViagemA1.calcularVelocMedia(160, 2);
		System.out.println("A velocidade média é: " + objViagemA1.getVelMedia() + " km/h.");

		objViagemA1.calcularTempoViagem(50, 100);
		System.out.println("O tempo de viagem foi: " + objViagemA1.getTempo()+" hora/minuto.");

		objViagemA1.calcularQtdadeLitros(160, 12);
		System.out.println("A quantidade de litros necessária é: " + objViagemA1.getQtdadeLitrosViagem()+" litros.");
	}

}
