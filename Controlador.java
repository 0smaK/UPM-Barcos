package p1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class Controlador /*implements MouseListener*/ extends MouseAdapter{
        Barquitos barquitos;
        public Controlador(Barquitos barquitos) {
            this.barquitos = barquitos;
        }

        public void mousePressed(MouseEvent e) {
            System.out.println((e+"\nHas pulsado en x:"+e.getX()+" y:"+e.getY()));
        }


    }

