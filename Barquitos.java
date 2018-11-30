package p1;

import java.awt.Frame;


public class Barquitos extends Frame implements IBarquitos{

	public static void main(String[] args) {
		int[] numBarcosLong = null;
		int tamanioTablero = 8;
		new Barquitos(numBarcosLong, tamanioTablero);
		
	}
	
	public Barquitos(int[] numBarcosLong, int tamanioTablero) {
		Frame frame = new Frame();
		
		int tamCasilla = 50; //50px
		int margenCasilla = 5; // 5px
		
		tamanioTablero = margenCasilla+(tamanioTablero*(tamCasilla+margenCasilla));
		
		frame.setSize(tamanioTablero,tamanioTablero);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
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
