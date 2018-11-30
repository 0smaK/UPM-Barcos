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
	 * @param g - Objeto gr�fico
	 */
	public void paint(Graphics g);
	
	/**
	 * Actualiza el dibujo del modelo
	 * @param o - Informaci�n del modelo (Tablero)
	 * @param arg Posibles argumentos para parametrizar el resultado de la vista
	 */
	public void update(Observable o, Object arg);
}
