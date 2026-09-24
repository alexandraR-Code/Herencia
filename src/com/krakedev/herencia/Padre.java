package com.krakedev.herencia;


// atributos 
public class Padre {
	private  int defectos;
	private int virtudes;
	private double totalAhorrado;
	private String nombre;	
//metodos getter y setter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
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
	
	public Padre(int virtudes, int defectos, String nombre) {
		this.defectos = defectos;
		this.virtudes = virtudes;
		this.nombre = nombre;
		
	}
	
	public void ahorrar(double monto) {
		totalAhorrado += monto;
	}
	
	@Override
	public String toString() {
		return "Defectos: " + defectos + " Virtudes: " + virtudes + " Total ahorro: " + totalAhorrado + " Nombre: " + nombre;
	}
	
}
