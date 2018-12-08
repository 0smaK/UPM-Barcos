package p1;

public class Tablero implements ITablero {
	
	private int tamanioTablero;
	
	public Tablero(int tamanio) {
		tamanioTablero = tamanio;
	}
	
	@Override
	public int[][] getTablero() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTablero(int[][] tablero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTamanio() {
		return tamanioTablero;
	}

	@Override
	public int getPosicion(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPosicion(int x, int y, int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borra() {
		// TODO Auto-generated method stub
		
	}

}
