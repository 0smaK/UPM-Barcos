package p1;

import java.awt.Canvas;
import java.awt.Graphics;
<<<<<<< HEAD
import java.awt.Graphics2D;
=======
>>>>>>> 63bed27159feab074bb502bf33e5aaf24a55120b
import java.util.Observable;

public class Vista extends Canvas implements IVista {
	
<<<<<<< HEAD
	private Graphics2D g2d;
	private Tablero modelo;
	
	
	
	
	public Vista(Tablero modelo) {
		this.modelo = modelo;
	}
	

	@Override
	public void paint(Graphics g) {			
		g2d = (Graphics2D) g;
		g2d.setColor(java.awt.Color.BLACK); 
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
	    

=======
	public Vista(Tablero modelo) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
>>>>>>> 63bed27159feab074bb502bf33e5aaf24a55120b
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
