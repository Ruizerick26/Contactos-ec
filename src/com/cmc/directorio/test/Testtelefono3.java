package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class Testtelefono3 {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro","0963113677",30); 
		Telefono telf2 = new Telefono("claro","0962114655",40); 
		Telefono telf3 = new Telefono("movi","0997664677",50); 
		AdminTelefono at = new AdminTelefono();
		int contado = at.contarMovi(telf1, telf2, telf3);
		System.out.println("La cantidad de movi son: " + contado);
		
	}
}
