package br.com.meuprojeto;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int maior = m.maior(20,30);
		double soma = m.soma(10, 15);
		System.out.println(maior);
		System.out.println(soma);

	}

}
