package com.pi.bancodigital;

public class ContaPoupanca  extends Conta {
	
	public ContaPoupanca(Cliente cliente){
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println(" === Extrato conta poupan�a ===");
		imprimirInfosPadr�o();
	}
	
}
