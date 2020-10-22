import java.awt.*;
import javax.swing.*;
/**
 * <h1> Practica4 </h1>
 * <p> Clase que le da respuesta a la practica 4 </p>
 * @author Valdivia Gomez Victor Rafael <br> 18290936 <br>
 * 24/9/2020
 * 
 */

public class Circunferencia extends JFrame {
    /**
     * <h2> Metodo constructor para inciar la ventana </h2>
     * <p> En el se inicializan los componentes que se utilizan para la aplicacion grafica. <br>
     */
    public Circunferencia () {
        //setLayout(new FlowLayout());
        setBounds(20, 20, 1000, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    /**
     *  <p> Primero metodo sobrecargado </p>
     * <br> Este metodo no hace mucho xd 
     * @param x
     * @param y
     * @param g
     */
    public void dibujarPixel(int x, int y, Graphics g) {
        g.fillRect(x, y, 1, 1);
    }
    /**
     * <h1> Segundo metodo sobrecargado. </h1>
     * <br> 
     * <p> Este metodo le da color al pixel. </p> 
     * @param x
     * @param y
     * @param c
     * @param g
     */
    public void dibujarPixel(int x, int y, Color c, Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, 1, 1);
    }
    /**
     * Metodo que dibuja una linea dada dos puntos
     * @param x1 
     * @param x2
     * @param y1
     * @param y2
     * @param c
     * @param g
     */
    public void dibujarLinea(int x1, int x2, int y1, int y2, Color c, Graphics g) {
        g.setColor(c);
        float m;
        int xa1, ya1;
        int y;
        if(x2 < x1){
            xa1 = x1;
            x1 = x2;
            x2 = xa1;
            ya1 = y1;
            y1 = y2;
            y2 = ya1; 
        } 
        if (x1 == x2) {
            if(y1>y2){
                ya1 = y1;
                y1 = y2;
                y2 = ya1; 
             }
            for (int i = y1; i <= y2; i++) {
                g.fillRect(x1, i, 1, 1);
            }
        } else {
            m = (float) ((float) (y2 - y1) / (float) (x2 - x1));
            for (int i = x1; i <= x2; i++) {
                y = (int) (m * (i - x1) + y1);
                g.fillRect(i, y, 1, 1);
            }
        } 
    }
    /**
     * <p> Metodo del algoritmo circulo General </p>
     * <br> Este es el primero de los metodos para dibujar una circunferencia
     * @param xc valor en las cordenadas x
     * @param yc valor en las cordenadas y
     * @param r tamano del radio de la circunferencia 
     * @param g Graphics para poder dibujar xd
     */
    public void ciuculo_general(int xc, int yc, int r, Graphics g) {
		int x;
		float y1, y2;
		for(x = xc-r; x<=xc+r; x=x+2){
			y1 = (float)(yc + Math.sqrt((r*r)-((x-xc)*(x-xc))));
			y2 =(float)(yc - Math.sqrt((r*r)-((x-xc)*(x-xc))));
			dibujarPixel(x,Math.round(y1),g);
			dibujarPixel(x,Math.round(y2),g);
		}
    }
    /**
     * <p> Metodo del algoritmo circulo Incremental </p>
     * <br> Este es el segundo de los metodos para dibujar una circunferencia
     * @param xc valor en las cordenadas x
     * @param yc valor en las cordenadas y
     * @param r tamano del radio de la circunferencia 
     * @param g Graphics para poder dibujar xd
     */
    public void circulo_Incremental(int xc, int yc, int r, Color c, Graphics g) {
		int tx, ty;
		float dt, cc, ss, x, y, aux;
		dt = (float)1/r;
		cc = (float)(Math.cos(dt));
		ss = (float) ((Math.sin(dt)));
		x=0;
		y=r;
		while(y >= (Math.abs(x))){
			tx = Math.round(x);
			ty = Math.round(y);

			dibujarPixel(xc+tx,yc+ty,c,g);
			dibujarPixel(xc-tx,yc+ty,c,g);
			dibujarPixel(xc+tx,yc-ty,c,g);
			dibujarPixel(xc-tx,yc-ty,c,g);

			dibujarPixel(xc+ty,yc+tx,c,g);
			dibujarPixel(xc+ty,yc-tx,c,g);
			dibujarPixel(xc-ty,yc+tx,c,g);
			dibujarPixel(xc-ty,yc-tx,c,g);

			aux = x;
			x = (x*cc)-(y*ss);
			y = (y*cc)+(aux*ss);
		}
	}
    /**
     * <p> Metodo del algoritmo circulo Bresenham </p>
     * <br> Este es el tercer de los metodos para dibujar una circunferencia
     * @param xc valor en las cordenadas x
     * @param yc valor en las cordenadas y
     * @param r tamano del radio de la circunferencia 
     * @param g Graphics para poder dibujar xd
     */
	public void circulo_Bresenham(int xc, int yc, int r, Color c, Graphics g) {
		int p, x, y;
		x = 0;
		y = r;
		p =3 - 2 *r;
		while(x<=y){
			dibujarPixel(xc+x,yc+y, c, g);
			dibujarPixel(xc-x,yc+y,c,g);
			dibujarPixel(xc+x,yc-y,c,g);
			dibujarPixel(xc-x,yc-y,c,g);

    		dibujarPixel(xc+y,yc+x,c,g);
			dibujarPixel(xc-y,yc+x,c,g);
			dibujarPixel(xc+y,yc-x,c,g);
            dibujarPixel(xc-y,yc-x,c,g);
        

			if(p<0)
				p = p + 4 * x + 6;
			else{
				p = p + 4 * (x - y) + 10;
				y = y - 1;
			}
				x = x + 1;
		}
    }
    /**
     * <p> Metodo para dibjar un gusano </p>
     * @param g Graphics para poder dibujar xd
     */
    public void gusano(Graphics g) {
        for (int i = 0; i <= 3; i++) {
            circulo_Incremental(40 + (i * 30), 130, 30, Color.GREEN, g);
        }
        circulo_Incremental(180, 125, 40, Color.GREEN, g);
        circulo_Incremental(235, 130, 15, Color.BLACK, g);
        circulo_Incremental(200, 115, 8, Color.BLACK, g);
    }
     /**
     * <p> Metodo para dibjar un oso </p>
     * @param g Graphics para poder dibujar xd
     */
    public void 熊(Graphics g) {
        Color color = new Color(118,60,40);
        circulo_Incremental(400, 150, 50, color, g);
        circulo_Incremental(420, 130, 3, Color.black, g);
        circulo_Incremental(380, 130, 3, Color.black, g);
        circulo_Incremental(420, 130, 11, Color.black, g);
        circulo_Incremental(380, 130, 11, Color.black, g);
        circulo_Incremental(393, 170, 8, color, g);
        circulo_Incremental(409, 170, 8, color, g);
        circulo_Incremental(365, 105, 15, color, g);
        circulo_Incremental(435, 105, 15, color, g);
    }
     /**
     * <p> Metodo para dibjar un gato </p>
     * @param g Graphics para poder dibujar xd
     */
    public void 猫(Graphics g) {
        Color color = new Color(0,0,0);
        int si = 150;
        circulo_Incremental(400 + si, 150, 50, color, g);
        circulo_Incremental(420 + si, 130, 3, Color.black, g);
        circulo_Incremental(380 + si, 130, 3, Color.black, g);
        circulo_Incremental(420 + si, 130, 11, Color.black, g);
        circulo_Incremental(380 + si, 130, 11, Color.black, g);
        circulo_Incremental(393 + si, 170, 8, color, g);
        circulo_Incremental(409 + si, 170, 8, color, g);
        
        dibujarLinea(505, 505, 100, 125, color, g);
        dibujarLinea(505, 519, 100, 110, color, g);

        dibujarLinea(595, 595, 100, 125, color, g);
        dibujarLinea(595, 580, 100, 110, color, g);

        dibujarLinea(380 + si, 390 + si, 174, 174, color, g);
        dibujarLinea(380 + si, 390 + si, 170, 170, color, g);

        dibujarLinea(410 + si, 420 + si, 174, 174, color, g);
        dibujarLinea(410 + si, 420 + si, 170, 170, color, g);
    }
     /**
     * <p> Metodo para dibjar un emoticono </p>
     * @param g Graphics para poder dibujar xd
     */
    public void emoticono(Graphics g) {
        int si = 150;
        circulo_Incremental(400 + si, 150 + si, 50, Color.yellow, g);
        dibujarLinea(520, 540, 290, 290, Color.black, g);
        dibujarLinea(560, 580, 290, 290, Color.black, g);

        dibujarLinea(540, 560, 320, 320, Color.black, g);
        
    }
    /**
     * <p> Metodo Graphics para poder usar las herramientas de JAVA </p>
     * @param g Parametro para el uso de Graphics
     */
    public void paint(Graphics g) {
        super.paint(g);
        gusano(g);
        熊(g);
        猫(g);
        emoticono(g);
    }
    
    public static void main(String[] args) {
        new Circunferencia();   
    }
}

