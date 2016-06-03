package com.prototype.outro2;

public class Tablet extends Eletronico{
	
	public Tablet(String tipo, double preco) {
		super(tipo, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Eletronico clone(String tipo, double preco) {
		// TODO Auto-generated method stub
		return new Tablet(tipo,preco);
	}
}
