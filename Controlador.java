package p1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador /*implements MouseListener*/ extends MouseAdapter{
	public Controlador(Barquitos barquitos) {
		
	}
	

	public void mousePressed(MouseEvent e) {
		System.out.println(("Has pulsado en x:"+e.getX()+" y:"+e.getY()));
	}
}
