package p1;

public interface ITablero {

	/**
	 * Devuelve el Tablero como una matriz
	 * @return matriz de int conteniendo los valores de las casillas del Tablero
	 */
<<<<<<< HEAD
	public int[][] getTablero();
=======
	int[][] getTablero();
>>>>>>> 63bed27159feab074bb502bf33e5aaf24a55120b

	/**
	 * Modifica el contenido del Tablero completo
	 * @param tablero - Matriz de enteros conteniendo el valor de cada casilla
	 */
	public void setTablero(int[][] tablero);
	
	/**
<<<<<<< HEAD
	 * Indica el tamaÃ±o que tiene el tablero: la dimension de la matriz de casillas
	 * @return TamaÃ±o del tablero; por ejemplo: 8 en un tablero de 8x8
=======
	 * Indica el tamaño que tiene el tablero: la dimension de la matriz de casillas
	 * @return Tamaño del tablero; por ejemplo: 8 en un tablero de 8x8
>>>>>>> 63bed27159feab074bb502bf33e5aaf24a55120b
	 */
	public int getTamanio();
	
	/**
	 * Devuelve el valor de la casilla indicada
	 * @param x - Posicion x de la casilla
	 * @param y - Posicion y de la casilla
	 * @return valor de la casilla
	 */
	public int getPosicion(int x,int y);
	
	/**
	 * Modifica el valor de la casilla indicada
<<<<<<< HEAD
	 * @param x - Posicion x de la casilla
	 * @param y - Posicion y de la casilla
=======
	 * @param x - Posición x de la casilla
	 * @param y - Posición y de la casilla
>>>>>>> 63bed27159feab074bb502bf33e5aaf24a55120b
	 * @param valor
	 */
	public void setPosicion(int x, int y, int valor);
	
	/**
	 * Inicializa los valores de todas las casillas del Tablero a su estado inicial (agua)
	 */
	public void borra();
	
	
	
	

}
