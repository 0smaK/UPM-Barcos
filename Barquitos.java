package p1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Barquitos extends Frame implements IBarquitos{
    private Tablero modelo;
    private Vista vista;
    
	public static void main(String[] args) {
		int[] numBarcosLong = null;
		int tamanioTablero = 8;
		new Barquitos(numBarcosLong, tamanioTablero);
	}
	
	public Barquitos(int[] numBarcosLong, int tamanioTablero) {
		modelo = new Tablero(tamanioTablero);
		vista = new Vista(modelo);
		Frame frame = new Frame();
		int tamCasilla = 50; //50px
		int margenCasilla = 5; // 5px
		
		int tamframe = margenCasilla+(tamanioTablero*(tamCasilla+margenCasilla));
			
		frame.setSize(tamframe,(tamframe+25));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.add(vista);
	}
	

	
	@Override
	public void colocarBarcos() {
		
	}

	@Override
	public void disparo(int x, int y) {
		
	}

	@Override
	public boolean finPartida() {
		//todo
		return false;
	}

	@Override
	public void mostrarFinPartida() {
		
	}

}
