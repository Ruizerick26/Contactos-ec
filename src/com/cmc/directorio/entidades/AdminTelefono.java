package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono at) {
		if(at.getOperadora() == "movi") {
			at.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono at1, Telefono at2, Telefono at3) {
		int contador=0;
		if(at1.getOperadora() == "movi") {
			contador = contador + 1;
		}
		if(at2.getOperadora() == "movi") {
			contador = contador + 1;
		}
		if(at3.getOperadora() == "movi") {
			contador = contador + 1;
		}
		
		return contador;
	}
	public int contarClaro(Telefono at1, Telefono at2, Telefono at3,Telefono at4) {
		int contador=0;
		if(at1.getOperadora() == "claro") {
			contador = contador + 1;
		}
		if(at2.getOperadora() == "claro") {
			contador = contador + 1;
		}
		if(at3.getOperadora() == "claro") {
			contador = contador + 1;
		}
		if(at4.getOperadora() == "claro") {
			contador = contador + 1;
		}
		return contador;
	}

}
