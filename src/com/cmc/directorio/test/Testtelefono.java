package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;

public class Testtelefono {
	public static void main(String[] args) {
		Telefono telf = new Telefono("movi","09941234123",10);
		System.out.println("Operadora: "+ telf.getOperadora() + "\nNúmero: "+ telf.getNumero() +
				"\nCódigo: "+ telf.getCodigo() + "\nWhatsapp: " + telf.isTieneWhatsapp());
	}
}
