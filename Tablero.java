package p1;

public class Tablero implements ITablero {
	
	private int tamanioTablero;
	private int tablero[][];
	public int estado; //0 = BARCO sin daño, 1 = AGUA, 2 = BARCO TOCADO, 3 = BARCO HUNDIDO
	
	public Tablero(int tamanio) {
		tamanioTablero = tamanio;
		tablero = new int[tamanioTablero][tamanioTablero];
	}
	
	@Override
	public int[][] getTablero() {
		return tablero;
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
		estado = tablero[x][y];
		return estado;
	}

	@Override
	public void setPosicion(int x, int y, int valor) {
		tablero[x][y] = valor;
	}

	@Override
	public void borra() {
		
	}

}
