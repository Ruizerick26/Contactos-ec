package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Admincontacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class Testcontacto3 {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "0986754332", 20);
		Telefono telf2 = new Telefono("claro", "0975443566", 30);
		Contacto c1 = new Contacto("Luisa", "Lopez", telf1, 75);
		Contacto c2 = new Contacto("Matias", "Rivera", telf2, 70);
		Admincontacto ad = new Admincontacto();
		Contacto ax = ad.buscarMasPesado(c1, c2);
		boolean ar = ad.compararOperadoras(c1, c2);
		System.out.println("Nombre: " + ax.getNombre() + "\nApellido: "+ ax.getApellido() + 
				"\nTeléfono: " + ax.getTelefono().getNumero() + "\nPeso: " + ax.getPeso());
		System.out.println("Tiene la misma operadora es: " + ar);
		
		
	}
}
