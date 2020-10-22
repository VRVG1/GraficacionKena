import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * <h1> Practica4 </h1>
 * <p> Clase que le da respuesta a la practica 4 parte C </p>
 * @author Valdivia Gomez Victor Rafael <br> 18290936 <br>
 * 16/5/2020
 * 
 */
public class Linea extends JFrame {

    /**
     * <h2> Metodo constructor para inciar la ventana </h2>
     * <p> En el se inicializan los componentes que se utilizan para la aplicacion grafica. <br>
     */
    public Linea() {
        //setLayout(new FlowLayout());
        setBounds(20, 20, 1000, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
     * Metodo para poder dibujar las letras ITCG <br>
     * usando el medodo dibujarLinea
     */
    public void itcg(Graphics g) {
        //I
        dibujarLinea(30, 70, 50, 50, Color.BLUE, g);
        dibujarLinea(30, 70, 100, 100, Color.BLUE, g);
        dibujarLinea(50, 50, 50, 100, Color.BLUE, g);
        //I
        //T
        dibujarLinea(74, 104, 50, 50, Color.BLUE, g);
        dibujarLinea(89, 89, 50, 100, Color.BLUE, g);
        //T
        //C
        dibujarLinea(108, 138, 50, 50, Color.BLUE, g);
        dibujarLinea(108, 138, 100, 100, Color.BLUE, g);
        dibujarLinea(108, 108, 50, 100, Color.BLUE, g);
        //C
        //G
        dibujarLinea(146, 176, 50, 50, Color.BLUE, g);
        dibujarLinea(146, 176, 100, 100, Color.BLUE, g);
        dibujarLinea(146, 146, 50, 100, Color.BLUE, g);
        dibujarLinea(176, 176, 75, 100, Color.BLUE, g);
        dibujarLinea(156, 176, 75, 75, Color.BLUE, g);
        //G
    }
    /**
     * Metodo para poder dibujar el cuadrado <br>
     * usando el medodo dibujarLinea
     */
    public void cuadrado(Graphics g) {
        //Cuadrado
        dibujarLinea(200, 250, 50, 50, Color.BLUE, g);
        dibujarLinea(200, 250, 100, 100, Color.BLUE, g);
        dibujarLinea(200, 200, 50, 100, Color.BLUE, g);
        dibujarLinea(250, 250, 50, 100, Color.BLUE, g);
        //Cuadrado
        //Cruz
        dibujarLinea(225, 225, 50, 100, Color.BLUE, g);
        dibujarLinea(200, 250, 75, 75, Color.BLUE, g);
        //Cruz
        //equisd
        dibujarLinea(200, 250, 50, 100, Color.BLUE, g);
        dibujarLinea(200, 250, 100, 50, Color.BLUE, g);
        //equisd
        //equisd angosta
        dibujarLinea(215, 235, 50, 100, Color.blue, g);
        dibujarLinea(212, 235, 100, 50, Color.blue, g);
        dibujarLinea(200, 250, 65, 85, Color.blue, g);
        dibujarLinea(200, 250, 85, 65, Color.blue, g);
        //equisd angosta
    }
    /**
     * Metodo para poder dibujar la onda cuadrada <br>
     * usando el medodo dibujarLinea
     */
    public void ondaCuadrada(Graphics g) {
        dibujarLinea(300, 320, 100, 100, Color.BLUE, g);
        dibujarLinea(320, 320, 70, 100, Color.BLUE, g);
        dibujarLinea(320, 340, 70, 70, Color.BLUE, g);

        dibujarLinea(340, 340, 70, 100, Color.blue, g);
        dibujarLinea(340, 360, 100, 100, Color.blue, g);
        dibujarLinea(360, 360, 70, 100, Color.blue, g);
        dibujarLinea(360, 380, 70, 70, Color.blue, g);
    }
    /**
     * Metodo para poder dibujar la casa <br>
     * usando el medodo dibujarLinea
     */
    public void casa(Graphics g) {
        dibujarLinea(200, 300, 300, 300, Color.BLUE, g);
        dibujarLinea(200, 200, 300, 400, Color.BLUE, g);
        dibujarLinea(200, 300, 400, 400, Color.BLUE, g);
        dibujarLinea(300, 300, 300, 400, Color.BLUE, g);

        dibujarLinea(200, 250, 300, 250, Color.BLUE, g);
        dibujarLinea(250, 300, 250, 300, Color.BLUE, g);

        dibujarLinea(210, 240, 340, 340, Color.BLUE, g);
        dibujarLinea(210, 240, 350, 350, Color.BLUE, g);
        dibujarLinea(210, 210, 340, 350, Color.BLUE, g);
        dibujarLinea(240, 240, 340, 350, Color.BLUE, g);
        dibujarLinea(225, 225, 340, 350, Color.BLUE, g);
        dibujarLinea(210, 240, 345, 345, Color.BLUE, g);

        dibujarLinea(270, 290, 340, 340, Color.BLUE, g);
        dibujarLinea(270, 290, 390, 390, Color.BLUE, g);
        dibujarLinea(270, 270, 340, 390, Color.BLUE, g);
        dibujarLinea(290, 290, 340, 390, Color.BLUE, g);

        dibujarLinea(280, 285, 365, 365, Color.BLUE, g);
        dibujarLinea(280, 285, 373, 373, Color.BLUE, g);
        dibujarLinea(280, 280, 365, 373, Color.BLUE, g);
        dibujarLinea(285, 285, 365, 373, Color.BLUE, g);
        


    }
    /**
     * Metodo paint
     */
    public void paint(Graphics g) {
        super.paint(g);
        itcg(g);
        cuadrado(g);
        ondaCuadrada(g);
        casa(g);
        g.setColor(Color.red);
        //Letras ITCG
        g.drawLine(30, 50, 70, 50);
        g.drawLine(30, 100, 70, 100);
        g.drawLine(50, 50, 50, 100);
        g.drawLine(74, 50, 104, 50);
        g.drawLine(89, 50, 89, 100);
        g.drawLine(108, 50, 138, 50);
        g.drawLine(108, 100, 138, 100);
        g.drawLine(108, 50, 108, 100);
        g.drawLine(146, 50, 176, 50);
        g.drawLine(146, 100, 176, 100);
        g.drawLine(146, 50, 146, 100);
        g.drawLine(176, 75, 176, 100);
        g.drawLine(156, 75, 176, 75);
        //Cuadrado
        g.drawLine(200, 50, 250, 50);
        g.drawLine(200, 100, 250, 100);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(250, 50, 250, 100);
        g.drawLine(225, 50, 225, 100);
        g.drawLine(200, 75, 250, 75);
        g.drawLine(200, 50, 250, 100);
        g.drawLine(200, 100, 250, 50);
        g.drawLine(212, 50, 235, 100);
        g.drawLine(212, 100, 235, 50);
        g.drawLine(200, 65, 250, 85);
        g.drawLine(200, 85, 250, 65);
        //Escalon
        g.drawLine(300, 100, 320, 100);
        g.drawLine(320, 70, 320, 100);
        g.drawLine(320, 70, 340, 70);
        g.drawLine(340, 70, 340, 100);
        g.drawLine(340, 100, 360, 100);
        g.drawLine(360, 70, 360, 100);
        g.drawLine(360, 70, 380, 70);
        //Casa
        g.drawLine(200, 300, 300, 300);
        g.drawLine(200, 300, 200, 400);
        g.drawLine(200, 400, 300, 400);
        g.drawLine(300, 300, 300, 400);
        g.drawLine(200, 300, 250, 250);
        g.drawLine(250, 250, 300, 300);
        g.drawLine(210, 340, 240, 340);
        g.drawLine(210, 350, 240, 350);
        g.drawLine(210, 340, 210, 350);
        g.drawLine(240, 340, 240, 350);
        g.drawLine(225, 340, 225, 350);
        g.drawLine(210, 345, 240, 345);
        g.drawLine(270, 340, 290, 340);
        g.drawLine(270, 390, 290, 390);
        g.drawLine(270, 340, 270, 390);
        g.drawLine(290, 340, 290, 390);
        g.drawLine(280, 365, 285, 365);
        g.drawLine(280, 373, 285, 373);
        g.drawLine(280, 365, 280, 373);
        g.drawLine(285, 365, 285, 373);


    }

    public static void main(String[] args) {
        new Linea();
    }
}