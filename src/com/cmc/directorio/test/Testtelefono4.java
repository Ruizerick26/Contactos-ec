package com.cmc.directorio.test;


import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class Testtelefono4 {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro","0963113677",60); 
		Telefono telf2 = new Telefono("claro","0962114655",70); 
		Telefono telf3 = new Telefono("movi","0997664677",80); 
		Telefono telf4 = new Telefono("claro","0997664677",90); 
		AdminTelefono at = new AdminTelefono();
		int contado = at.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println("La cantidad de claro son: " + contado);
		
	}
}
