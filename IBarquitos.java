package p1;

public interface IBarquitos {
	
	/**
	 * Coloca aleatoriamente los barcos en el Tablero
	 */
	public void colocarBarcos();
	
	/**
	 * Actualiza el tablero en funcion de su estado actual y del disparo realizado en la casilla (x,y)
	 * @param x - coordenada x del disparo.
	 * @param y - coordenada y del disparo.
	 */
	public void disparo(int x, int y);
	
	/**
	 * Indica si se ha llegado al final de la partida (todos los barcos hundidos)
	 * @return true: todos los barcos han sido hundidos
	 */
	public boolean finPartida();
	
	/**
	 * Muestra todo el Tablero (agua, barcos tocaos y barcos hundidos)
	 */
	public void mostrarFinPartida();

}
