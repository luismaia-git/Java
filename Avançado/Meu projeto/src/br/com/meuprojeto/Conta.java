package br.com.meuprojeto;

public class Conta {
	
	String cliente;
	double saldo;
	
	void exibesaldo( ) {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	void sacar(double valor) {
		if(saldo > 0) {
			saldo -= valor;
		} else {
			System.out.println("Não há saldo na conta");
		};
		
	};
	
	void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Você não está depositando nenhum valor");
		} else {
			saldo += valor;
		};
	};
	
	void transferir (Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	};
}

