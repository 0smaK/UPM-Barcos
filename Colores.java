package p1;

import java.awt.Color;

public class Colores {
	
	public static final Color[] color = {
			Color.BLACK,
			Color.BLUE,
			Color.RED,
			Color.MAGENTA 
		};
	
	public static final int CUBIERTO = 0;
	public static final int AGUA = 1;
	public static final int TOCADO = 2;
	public static final int HUNDIDO = 3;
	
	public Colores() {
		super(); 
	}	
	
	public static int indice(Color c) {
		int index = -1;
		for(int i = 0; i<color.length;i++) {
			if(c==color[i]) {
				index = i;
			}
		}
		return index;
	}
}
