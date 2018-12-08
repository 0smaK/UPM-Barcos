package p1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.lang.Object;

public interface IVista {
	public static final int COMIENZO_X = 0;
	public static final int COMIENZO_Y = 0;
	public static final int LADO = 0;
	
	/**
	 * Dibuja el modelo
<<<<<<< HEAD
	 * @param g - Objeto grafico
=======
	 * @param g - Objeto gráfico
>>>>>>> 63bed27159feab074bb502bf33e5aaf24a55120b
	 */
	public void paint(Graphics g);
	
	/**
	 * Actualiza el dibujo del modelo
<<<<<<< HEAD
	 * @param o - Informacion del modelo (Tablero)
=======
	 * @param o - Información del modelo (Tablero)
>>>>>>> 63bed27159feab074bb502bf33e5aaf24a55120b
	 * @param arg Posibles argumentos para parametrizar el resultado de la vista
	 */
	public void update(Observable o, Object arg);
}
