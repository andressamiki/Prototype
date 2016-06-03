package com.prototype.outro2;

public abstract class Eletronico implements Cloneable{
	private String tipo;
	private double preco;
	
	public Eletronico(String tipo, double preco) {
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public abstract Eletronico clone(String tipo, double preco);
	
	public void info(){
		System.out.println("Tipo do aparelho: "+tipo);
		System.out.println("Preço do aparelho: "+preco);
	}
}
