package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Admincontacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class Testactivos {
	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0957864356", 10);
		Contacto c = new Contacto("Marcelo", "Perez", telf, 75);
		Admincontacto ac = new Admincontacto();
		AdminTelefono at = new AdminTelefono();
		System.out.println("Nombre: "+c.getNombre()+"\nApellido: "+ c.getApellido() +
				"\nTelefono: " + c.getTelefono().getNumero() + "\nWhatsapp: " +c.getTelefono().isTieneWhatsapp());
		System.out.println("Esta activo: " + c.isActivo());
		System.out.println("---------------------------");
		at.activarMensajeria(telf);
		System.out.println("Nombre: "+c.getNombre()+"\nApellido: "+ c.getApellido() +
				"\nTelefono: " + c.getTelefono().getNumero() + "\nWhatsapp: " +c.getTelefono().isTieneWhatsapp());
		ac.activarUsuario(c);
		System.out.println("Esta activo: " + c.isActivo());
		
		
	}
}
