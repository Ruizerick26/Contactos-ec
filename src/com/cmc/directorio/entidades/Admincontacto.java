package com.cmc.directorio.entidades;

public class Admincontacto {
	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.getPeso() > c2.getPeso()) {
			Contacto c = c1;
			return c;
		}
		else {
			Contacto c = c2;
			return c;
		}
	}
	public boolean compararOperadoras(Contacto c1,Contacto c2) {
		if(c1.getTelefono().getOperadora() == c2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	public void activarUsuario(Contacto c1) {
		if(c1.getTelefono().isTieneWhatsapp() == true) {
			c1.setActivo(true);
		}
	}
}
