package br.com.meuprojeto;

public class Contateste {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = "Luís";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		// conta.sacar(200);
		// conta.exibesaldo();
		
		// conta.depositar(5000);
		// conta.exibesaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Antonio";
		destino.saldo = 2_000.00;
		destino.exibesaldo();
		
		conta.transferir(destino, 1000);
		
		
		conta.exibesaldo();
		destino.exibesaldo();
	}
}
