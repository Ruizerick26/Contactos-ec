package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;


public class Testtelefono2 {
	public static void main(String[] args) {
			Telefono telf = new Telefono("movi","098234234",20);
			AdminTelefono at = new AdminTelefono();
			at.activarMensajeria(telf);
			System.out.println("Operadora: "+ telf.getOperadora() + "\nNúmero: "+ telf.getNumero() +
					"\nCódigo: "+ telf.getCodigo() + "\nWhatsapp: " + telf.isTieneWhatsapp());
			
	}
}
