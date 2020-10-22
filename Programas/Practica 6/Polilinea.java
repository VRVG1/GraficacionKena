import javax.swing.*;
import java.awt.*;
public class Polilinea extends JFrame{
    
    public Polilinea () {
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
    public void dibujarLinea(int x1, int x2, int y1, int y2, int grosor, Color c, Graphics g) {
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
                g.fillRect(x1, i, grosor, grosor);
            }
        } else {
            m = (float) ((float) (y2 - y1) / (float) (x2 - x1));
            for (int i = x1; i <= x2; i++) {
                y = (int) (m * (i - x1) + y1);
                g.fillRect(i, y, grosor, grosor);
            }
        } 
    }
    /**
     * <p> Metodo para dibujar un poligono </p>
     * @param x
     * @param y
     * @param c
     * @param t
     * @param g
     */
    public void dibujar_Poligono(int[] x, int[] y, Color c, int t, Graphics g) {
        for (int i = 0; i < y.length; i++) {
            if (i+1 == y.length) {
                dibujarLinea(x[y.length - 1], x[0], y[y.length - 1], y[0], t, c, g);
            } else {
                dibujarLinea(x[i], x[i+1], y[i], y[i+1], t, c, g);
            }
        }
    }
    /**
     * <p> Metodo para hacer polilinea </p>
     * @param x
     * @param y
     * @param c
     * @param t
     * @param g
     */
    public void dibujar_Polilinia(int[] x, int[] y, Color c, int t, Graphics g) {
        for (int i = 0; i < y.length; i++) {
            if (i+1 != y.length) {
                dibujarLinea(x[i], x[i+1], y[i], y[i+1], t, c, g);
            } 
        }
    }
    /**
     * <p> Metodo para dibjar un octagono </p>
     * @param g Graphics para poder dibujar xd
     */
    public void octagono(Graphics g) {
        int[] x = {20,40,50,50,40,20,10,10};
        int[] y = {40,40,50,70,80,80,70,50};
        dibujar_Poligono(x, y, Color.BLACK, 2, g);
    }
    /**
     * <p> Metodo para dibjar una estrella </p>
     * @param g Graphics para poder dibujar xd
     */
    public void 星(Graphics g) {
        int a = 0;
        int[] x = {330 - a,350 - a,430 - a,365 - a,390 - a,328 - a,265 - a,290 - a,225 - a,305 - a};
        int[] y = {35,115,113,160,240,190,240,160,113,115};
        dibujar_Poligono(x, y, Color.BLACK, 2, g);
    }
    /**
     * <p> Metodo para dibjar una cosa rara </p>
     * @param g Graphics para poder dibujar xd
     */
    public void eso(Graphics g) {
        int[] x = {100,105,105,110,115,120,125,125,130,125,125,120,115,110,105,105};
        int[] y = {60,55,50,50,45,50,50,55,60,65,70,70,75,70,70,65};
        dibujar_Poligono(x, y, Color.BLACK, 2, g);
    }
    /**
     * <p> Metodo para dibjar una flecha </p>
     * @param g Graphics para poder dibujar xd
     */
    public void arrow(Graphics g) {
        int[] x = {150,250,250,280,250,250,150,180};
        int[] y = {60,60,50,80,110,100,100,80};
        dibujar_Poligono(x, y, Color.BLACK, 2, g);
    }
    /**
     * <p> Metodo para dibjar una onda cuadrada </p>
     * @param g Graphics para poder dibujar xd
     */
    public void wave(Graphics g) {
        int[] x = {50,60,60,80,80,100,100,120,120,130};
        int[] y = {100,100,130,130,100,100,130,130,100,100};
        dibujar_Polilinia(x, y, Color.BLACK, 2, g);
    }
    /**
     * <p> Metodo para dibjar una rasho </p>
     * @param g Graphics para poder dibujar xd
     */
    public void rasho(Graphics g) {
        int[] x = {160,180,160,190,160,200};
        int[] y = {120,130,150,160,180,200};
        dibujar_Polilinia(x, y, Color.black, 2, g);
    }
    /**
     * <p> Metodo para dibjar una cara rara </p>
     * @param g Graphics para poder dibujar xd
     */
    public void putrid_face(Graphics g) {
        int[] x = {50,30,50,90,110,90};
        int[] y = {150,170,210,210,170,150};
        dibujar_Polilinia(x, y, Color.black, 2, g);
        int[] x1 = {45,55,65};
        int[] y1 = {175,155,175};
        dibujar_Polilinia(x1, y1, Color.black, 2, g);
        int[] x2 = {75,85,95};
        int[] y2 = {175,155,175};
        dibujar_Polilinia(x2, y2, Color.black, 2, g);
        int[] x3 = {60,70,80};
        int[] y3 = {180,190,180};
        dibujar_Polilinia(x3, y3, Color.black, 2, g);
        int[] x4 = {60,70,80};
        int[] y4 = {205,195,205};
        dibujar_Polilinia(x4, y4, Color.black, 2, g);
        
    }
    
    /**
     * <p> Metodo Graphics para poder usar las herramientas de JAVA </p>
     * @param g Parametro para el uso de Graphics
     */
    public void paint(Graphics g) {
        super.paint(g);
        octagono(g);
        星(g);
        eso(g);
        arrow(g);
        wave(g);
        rasho(g);
        putrid_face(g);
    }

    public static void main(String[] args) {
        new Polilinea();
    }
}
