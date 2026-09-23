package com.krakedev.herencia;


// atributos 
public class Padre {
	private  int defectos;
	private int virtudes;
	
//metodos getter y setter
	
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
	
	private void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
}
