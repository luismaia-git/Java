package br.com.meuprojeto;

public class Conta {
	
	String cliente;
	double saldo;
	
	void exibesaldo( ) {
		System.out.println(cliente + " seu saldo � " + saldo);
	}
	
	void sacar(double valor) {
		if(saldo > 0) {
			saldo -= valor;
		} else {
			System.out.println("N�o h� saldo na conta");
		};
		
	};
	
	void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Voc� n�o est� depositando nenhum valor");
		} else {
			saldo += valor;
		};
	};
	
	void transferir (Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	};
}

