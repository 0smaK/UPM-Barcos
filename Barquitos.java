package p1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Barquitos extends Frame implements IBarquitos{
    private Tablero modelo;
    private Vista vista;
    private Controlador controlador;
    public static final int[] numBarcosLong = {1,2,1,1}; //numero de barcos disponibles de ocupacion 1,2,3,4 casillas respectivamente
    public static final int tamanioTablero = 8;
    private static final int tamCasilla = 50;
    private static final int margenCasilla = 5;
    
    
    
    public int[][] barcos = new int[5][getNumBarcos()];
    
    
    
	public static void main(String[] args) {
		new Barquitos(numBarcosLong, tamanioTablero);
	}
	
	
	public Barquitos(int[] numBarcosLong, int tamanioTablero) {
		modelo = new Tablero(tamanioTablero);
		vista = new Vista(modelo);
		controlador = new Controlador(this);
		addMouseListener(controlador);


		Frame frame = new Frame();
		
		int tamframe = margenCasilla+(tamanioTablero*(tamCasilla+margenCasilla));
			
		frame.setSize(tamframe,(tamframe+25));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.add(vista);
		colocarBarcos();
	}
	
	public int getNumBarcos(){
		int nBarcos = 0;
		for (int i = 0; i<numBarcosLong.length;i++)
				nBarcos+=(i+1)*numBarcosLong[i];
		return nBarcos;
	}
	
	public int getTamanioMaximoBarco() {
		return numBarcosLong.length;
	}
	
	public int getTamanioTablero() {
		return tamanioTablero;
	}
	
	@Override
	public void colocarBarcos() {
		int x,y,orientacion,itb=0, itbl=0; //itb = iterador "sub"barcos; itbl = iterador barcos completos
		
		//primero ponemos el agua y luego los barcos
		for (int i = 0; i < tamanioTablero; i++)
			for (int j = 0; j < tamanioTablero; j++)
				modelo.setPosicion(i, j, 1); //1=agua
		
		
		//ahora los barcos
		for(int i = 0; i<numBarcosLong.length;i++) {
			//debug info
			System.out.println("\n\nTamaño del barco: "+(i+1));
			System.out.println("Cantidad de barcos: "+numBarcosLong[i]+"\n");
			for(int j = 0; j<numBarcosLong[i];j++) {
				if(i>0) {
					//si la longitud del barco es >1, generamos un 1 o un 0 al azar para establecer la orientacion del barco, en el caso de que el barco sea de long 1 no es necesario
					orientacion = (int) (Math.random()*2); //0 = horizontal; 1 = vertical
					
					//posicion azar 'x' e 'y'
					x = (int) (Math.random()*tamanioTablero);
					y = (int) (Math.random()*tamanioTablero);
					System.out.println("\n\n****** x: "+x+" --- y:"+y+"  *******\n\n");
					
					boolean agua = true, fuera = false;
					
					if(orientacion==0) { //horizontal
						for(int pos = x; pos<(x+i+1); pos++) { 
							if(pos>=tamanioTablero) fuera = true;
							if(!fuera) if(modelo.getPosicion(pos, y)!=1) agua = false;
						}
						if(!agua && fuera) { j--; agua = true; fuera = false; }  else {
							for(int pos = x; pos<(x+i+1); pos++) {							
								modelo.setPosicion(pos, y, 0); //añadimos barco
								System.out.println("["+i+" "+j+"] >> Barco generado en x:"+pos+" y:"+y);
								barcos[0][itb] = ((pos*tamCasilla)+((pos+1)*margenCasilla)); //px inicio
								barcos[1][itb] = ((y*tamCasilla)+((y+1)*margenCasilla)); //px final
								barcos[2][itb] = 0; //estado casilla
								barcos[3][itb] = 0; //estado casilla que se muestra en el tablero
								barcos[4][itb] = itbl; //id
								itb++;
							}
							itbl++;
						}
					}else { //VERTICAL
						for(int pos = y; pos<(y+i+1); pos++) { 
							if(pos>=tamanioTablero) fuera = true;
							if(!fuera)
								if(modelo.getPosicion(x, pos)!=1) agua = false;
					    }
						if(!agua && fuera) { j--; agua = true; fuera = false; } else {
							for(int pos = y; pos<(y+i+1); pos++) {							
								modelo.setPosicion(x, pos, 0); //añadimos barco
								System.out.println("Barco generado en x:"+x+" y:"+pos);
								barcos[0][itb] = ((x*tamCasilla)+((x+1)*margenCasilla)); //px inicio
								barcos[1][itb] = ((pos*tamCasilla)+((pos+1)*margenCasilla)); //px final
								barcos[2][itb] = 0; //estado casilla
								barcos[3][itb] = 0; //estado casilla que se muestra en el tablero
								barcos[4][itb] = itbl; //id
								itb++;
							}
							itbl++;
						}	
					}
				}else { //si la longitud del barco es 0
					x = (int) (Math.random()*tamanioTablero);
					y = (int) (Math.random()*tamanioTablero);
					if(modelo.getPosicion(x, y)==1) { 
						modelo.setPosicion(x, y, 0);
						System.out.println("Barco generado en x:"+x+" y:"+y);
						barcos[0][itb] = ((x*tamCasilla)+((x+1)*margenCasilla)); //px inicio
						barcos[1][itb] = ((y*tamCasilla)+((y+1)*margenCasilla)); //px final
						barcos[2][itb] = 0; //estado casilla
						barcos[3][itb] = 0; //estado casilla que se muestra en el tablero
						barcos[4][itb] = itbl; //id
						itb++;
					}
					itbl++;
				}
			}
		}
	}

	@Override
	public void disparo(int x, int y) {
		
	}

	@Override
	public boolean finPartida() {
		//todo
		return false;
	}

	@Override
	public void mostrarFinPartida() {
		
	}

}
