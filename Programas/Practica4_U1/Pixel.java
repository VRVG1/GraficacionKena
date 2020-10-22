import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * <h1> Practica4 </h1>
 * <p> Clase que le da respuesta a la practica 4 </p>
 * @author Valdivia Gomez Victor Rafael <br> 18290936 <br>
 * 15/9/2020
 * 
 */

public class Pixel extends JFrame {
    /**
     * <h2> Metodo constructor para inciar la ventana </h2>
     * <p> En el se inicializan los componentes que se utilizan para la aplicacion grafica. <br>
     */
    public Pixel () {
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
     * <p> Segundo metodo sobrecargado </p>
     * <br> Este metodo le da color al pixel 
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
     * <p> Tercer metodo sobrecargado </p>
     * <br> Este metodo le da grosor al pixel
     * @param x
     * @param y
     * @param t
     * @param g
     */
    public void dibujarPixel(int x, int y, int t, Graphics g) {
        g.fillRect(x, y, t, t);
    }
    /**
     * <p> Ultimo metodo sobrecargado </p>
     * <br> Es el metodo que le da color y grosor al pixel
     * @param x
     * @param y
     * @param c
     * @param t
     * @param g
     */
    public void dibujarPixel(int x, int y, Color c, int t, Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, t, t);
    }

    public void itcg(Graphics g){
        for (int i = 25; i < 100; i++) {
            //I
            dibujarPixel(i + 0, 50, Color.BLACK, g);
            dibujarPixel(63, 25 + i, Color.BLACK, g);
            dibujarPixel(i + 0, 125, Color.BLACK, g);
            //T
            dibujarPixel(i + 100, 50, Color.BLACK, g);
            dibujarPixel(163, 25 + i, Color.BLACK, g);
            if (i <= 80) {
                //C
                dibujarPixel(i + 200, 50, Color.BLACK, g);
                dibujarPixel(i + 200, 125, Color.BLACK, g);
                //C
                //G
                dibujarPixel(i + 300, 50, Color.BLACK, g);
                dibujarPixel(i + 300, 125, Color.BLACK, g);
                //G
            }
            //C
            dibujarPixel(225, 25 + i, Color.BLACK, g);
            //C
            if (i <= 60) {
                //G
                dibujarPixel(i + 320, 90, Color.BLACK, g);
                //G
                //G
                dibujarPixel(380, 65 + i, Color.BLACK, g);
                //G
            }
            //G
            dibujarPixel(325, 25 + i, Color.BLACK, g);
            //G
        }
    }

    public void cuadro(Graphics g) {
        for (int j = 50; j < 150; j++) {
            //Cuadrado
            dibujarPixel(j + 0, 200, Color.BLACK, g);
            dibujarPixel(j + 0, 300, Color.BLACK, g);
            dibujarPixel(50, 150 + j, Color.BLACK, g);
            dibujarPixel(150, 150 + j, Color.BLACK, g);
            //Cuadrado
            //Horizontal y Vertical
            dibujarPixel(j + 0, 250, Color.BLACK, g);
            dibujarPixel(100, 150 + j, Color.BLACK, g);
            //Horizontal y Vertical
            //Equisd
            dibujarPixel(j + 0, 150 + j, Color.BLACK, g);
            dibujarPixel(200 - j, 150 + j, Color.BLACK, g);
            //Equisd
            //Equisd mas angosta
            dibujarPixel(150 - (j / 2), 150 + j, Color.BLACK, g);
            dibujarPixel(50 + (j / 2), 150 + j, Color.BLACK, g);
            dibujarPixel(0 + j, 200 + (j / 2), Color.BLACK, g);
            dibujarPixel(0 + j, 300 - (j / 2), Color.BLACK, g);
            //Equisd mas angosta
        }       
    }

    public void ondaCuadrada(Graphics g) {
        for (int i = 0; i < 80; i++) {
            if (i <= 50) {
                dibujarPixel(200 + i, 280, Color.BLACK, g);
                dibujarPixel(250 + i, 200, Color.BLACK, g);
                dibujarPixel(300 + i, 280, Color.BLACK, g);
                dibujarPixel(350 + i, 200, Color.BLACK, g);
            }
            dibujarPixel(250, 200 + i, Color.BLACK, g);
            dibujarPixel(300, 200 + i, Color.BLACK, g);
            dibujarPixel(350, 200 + i, Color.BLACK, g);
            
        }
    }

    public void casa(Graphics g) {
        for (int j = 0; j < 100; j++) {
            dibujarPixel(j + 500, 200, Color.BLACK, g);
            dibujarPixel(j + 500, 300, Color.BLACK, g);
            dibujarPixel(500, 200 + j, Color.BLACK, g);
            dibujarPixel(600, 200 + j, Color.BLACK, g);

            if (j <= 50) {
                dibujarPixel(j + 500, 200 - j, Color.BLACK, g);
                dibujarPixel(600 - j, 200 - j, Color.BLACK, g);
                dibujarPixel(570, 245 + j, Color.BLACK, g);
                dibujarPixel(590, 245 + j, Color.BLACK, g);
            }
            if (j <= 20) {
                dibujarPixel(j + 520, 240, Color.BLACK, g);
                dibujarPixel(j + 520, 250, Color.BLACK, g);
                dibujarPixel(520 + j, 245, Color.BLACK, g);
                dibujarPixel(j + 570, 245, Color.BLACK, g);
                dibujarPixel(j + 570, 295, Color.BLACK, g);
            }
            if(j <= 10) {
                dibujarPixel(520, 240 + j, Color.BLACK, g);
                dibujarPixel(540, 240 + j, Color.BLACK, g);
                dibujarPixel(530, 240 + j, Color.BLACK, g);
            }
            if (j <= 5) {
                dibujarPixel(580 + j, 270, Color.BLACK, g);
                dibujarPixel(580 + j, 277, Color.BLACK, g);
            }
            if (j <= 7) {
                dibujarPixel(580, 270 + j, Color.BLACK, g);
                dibujarPixel(585, 270 + j, Color.BLACK, g);
            }
            //No se como colorear la casa xd
        }
    }


    public void paint(Graphics g) {
        super.paint(g);
        //itcg(g);
        //cuadro(g);
        //ondaCuadrada(g);
        //casa(g);
        g.setColor(Color.BLACK);
        //cir.circulo_Incremental(50,300,100,g);
        g.setColor(Color.RED);
        g.drawOval(100, 300, 50, 50);
        //linea.dibujarLinea(500, 800, 500, 800, Color.RED, g);

    }
    
    public static void main(String[] args) {
        new Pixel();   
    }
}