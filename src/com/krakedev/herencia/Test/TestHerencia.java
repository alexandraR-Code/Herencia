package com.krakedev.herencia.Test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hija hija = new Hija();
		
		hija.setVirtudes(5);
		hija.setDefectos(2);
		
		System.out.println("Virtudes: " + hija.getVirtudes());
		System.out.println("Defectos: " + hija.getDefectos());
		

	}

}
