package com.krakedev.herencia.Test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Padre p = new Padre(2, 2, "Carlos");
		p.ahorrar(2.5);
		System.out.println(p);
		
		Hija h = new Hija();
		h.ahorrar(2.5);
		System.out.println(h);
		
		Hijo h1 = new Hijo(2,5,2,"Pedro");
		h1.ahorrar(2.5);
		System.out.println(h1);

	}

}
