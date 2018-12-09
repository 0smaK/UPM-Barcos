package p1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.util.Observable;
import java.lang.Object;

public interface IVista {
	public static final int COMIENZO_X = 0;
	public static final int COMIENZO_Y = 0;
	public static final int LADO = 0;
	
	/**
	 * Dibuja el modelo
	 * @param g - Objeto grafico
	 */
	public void paint(Graphics g);
	
	/**
	 * Actualiza el dibujo del modelo
	 * @param evt - PropertyChangeEvent
	 */
	public void propertyChange(PropertyChangeEvent evt);
	
	}
