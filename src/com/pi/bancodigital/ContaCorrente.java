package com.pi.bancodigital;

public class ContaCorrente extends Conta {


	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" === Extrato conta corrente ===");
		imprimirInfosPadr�o();
	}
	
}
