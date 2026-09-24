package com.krakedev.herencia;

public class Hijo extends Padre{
	
	private int juguetes;

	public int getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(int juguetes) {
		this.juguetes = juguetes;
	}
	
	public Hijo(int virtudes, int defectos, int juguetes, String nombre) {
	    super(virtudes, defectos, nombre);
	    this.juguetes = juguetes;
	}
	
	@Override
	public String toString() {
		return "Defectos: " + getDefectos() + " Virtudes: " + getVirtudes() + " Ahorro total: " + getTotalAhorrado() + " Juguetes: " + juguetes + " Nombre: " + getNombre();
	}
	
	@Override
	public void ahorrar(double monto) {
		super.ahorrar(monto *0.5); 
	}
	
	

}
