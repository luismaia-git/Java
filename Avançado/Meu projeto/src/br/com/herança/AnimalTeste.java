package br.com.heran�a;

public class AnimalTeste {

	public static void main(String[] args) {
		cachorro Luck = new cachorro();
		Luck.comida = "Ra��o de cachorro";
		Luck.fazerBarulho();
		Luck.dormi();
		
		
		galinha lulu = new galinha();
		lulu.comida = "milho";
		lulu.fazerBarulho();
		lulu.dormi();
	}

}
