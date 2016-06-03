package com.prototype.outro2;

public class Celular extends Eletronico{

	public Celular(String tipo, double preco) {
		super(tipo, preco);
	}

	@Override
	public Eletronico clone(String tipo, double preco) {
		return new Celular(tipo,preco);
	}

}
