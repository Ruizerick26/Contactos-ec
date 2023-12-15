package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class Testcontacto1 {
	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0953554567", 10);
		Contacto c = new Contacto("Luis", "Reyes", telf, 75); 
		System.out.println("Nombre: " + c.getNombre() + "\nApellido: "+ c.getApellido() + 
				"\nTeléfono: " + c.getTelefono().getNumero() + "\nPeso: " + c.getPeso());
	}
}
