package rastreadorv2;

import java.io.IOException;

public class PruebaServidor {
	
	private static final int TAMHOST=2;
	
	public static void main(String[]args) throws IOException{
		Servidor s1 = new Servidor();
		s1.crearDireccionWeb(TAMHOST);
		s1.existePagina();
		s1.mostrarExiste();
		s1.mostrarNOExiste();
		s1.getHTML();
		s1.getHeadTag();
	}
}
