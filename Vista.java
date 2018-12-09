package p1;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class Vista extends Canvas implements IVista, PropertyChangeListener {
	
	private Graphics2D g2d;
	private Tablero modelo;
	
	public Vista(Tablero modelo) {
		this.modelo = modelo;
	}
	

	@Override
	public void paint(Graphics g) {			
		g2d = (Graphics2D) g;
		g2d.setColor(Colores.color[Colores.CUBIERTO]); 
	    int margen = 5; // en pixeles
	    int lado = 50;
	    int x = margen, y = margen;
	    System.out.println(modelo.getTamanio());
	    	for(int i=0;i<modelo.getTamanio();i++) {
		    	for(int k=0;k<modelo.getTamanio();k++) {
			    	g2d.fillRect(x, y, lado, lado);
			    	System.out.println("i: "+(i+1)+" x: "+x+ " y: "+y);
			    	x+=lado+margen;
			    }
		    		x=margen;
		    	y+=lado+margen;
		    }
	    

	}

	@Override
    public void propertyChange(PropertyChangeEvent evt) {   // Modelo Vista Controlador
        
    }
}
