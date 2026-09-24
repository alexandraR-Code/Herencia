package com.krakedev.herencia;


// atributos 
public class Padre {
	private  int defectos;
	private int virtudes;
	private double totalAhorrado;
	
//metodos getter y setter
	
	public double getTotalAhorrado() {
		return totalAhorrado;
	}
	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
//metodo impirmir atributos 
	
	public void imprimir() {
		System.out.println("Virtudes: " + virtudes);
		System.out.println("Defectos: " + defectos);
		
	}
	
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
	public Padre(int virtudes, int defectos){
		this.defectos = defectos;
		this.virtudes = virtudes;
		
	}
	
	public void ahorrar(double monto) {
		totalAhorrado += monto;
	}
	
}
