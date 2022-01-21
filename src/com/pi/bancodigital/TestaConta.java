package com.pi.bancodigital;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Jean Carlos Pigatto");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ari Pistola");
		
		Conta corrente = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente2);
		
		corrente.depositar(40);
		corrente.depositar(50);
		
		poupanca.depositar(20);
		corrente.transferir(30, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
