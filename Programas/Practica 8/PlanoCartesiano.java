import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.math.*;

/**
 * PlanoCartesiano
 * Esta clase dibuja un plano carteciano
 */
public class PlanoCartesiano extends JFrame {

    int origenX, origenY;
    int maxX, maxY;
    float escalarX, escalarY;
    /**
     * Constructor de la clase PlanoCartesiano <br>
     * Crea la ventana y contiene el codigo necesario para el funcionamiento correcto de la clase
     */
    public PlanoCartesiano() {
        setBounds(10, 10, 1000, 1000);
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                maxX = getWidth();
                maxY = getHeight();
                escalarX = (0.001f * maxX / 1);
                escalarY = (0.001f * maxY / 1);
                origenY = (int) (getHeight() / 2);
                origenX = (int) (getWidth() / 2);
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * Metodo de la clase Graphics para poder dibujar <br>
     * Tiene el codigo necesario para dibujar el plano cartesiano
     */
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(origenX, 0, origenX, maxY);
        g.drawLine(0, origenY, maxX, origenY);
    }
    /**
     *  <p1> Metodo principal para poder dibujar poligonoes </p1>
     * @param x Puntos en X
     * @param y Puntos en Y
     * @param g Parametro de la clase Graphics de Java para que todo amarre
     * @param kx Escalar en los puntos X, Favor de poner numero mayor a 0
     * @param ky Escalar en los puntos Y, Favor de poner numero mayor a 0
     */
    public  void dibujarPN(int[] x, int[] y, Graphics g, double kx, double ky) {
        int[] newX = new int[x.length];
        int[] newY = new int[y.length];
        for (int i = 0; i < y.length; i++) {
            newX[i] = (int) (origenX + (x[i] * (escalarX * kx)));
            newY[i] = (int) (origenY - (y[i] * (escalarY * ky)));
        }
        g.drawPolygon(newX, newY, newX.length);
    }
    /**
     *  <p1> Metodo para rotar las coordenadas en la parte de las x el angulo deseado </p1>
     * @param coordenadasX  Las coordenadas iniciales en la parte de X
     * @param coordenadasY  Las coordenadas iniciales en la parte de Y
     * @param angulo El angulo que se desea rotar en Degrees
     * @return  Las coordenadas en la parte de la X rotada
     */
    public static int[] rotarX(int[] coordenadasX, int[] coordenadasY, float angulo) {
        double radianes = Math.toRadians(angulo);
        int[] nuevasCoordenadasX = new int[coordenadasX.length];
        for (int i = 0; i < coordenadasX.length; i++) {
            nuevasCoordenadasX[i] = (int) (coordenadasX[i] * Math.cos(radianes) + coordenadasY[i] * Math.sin(radianes));

        }
        return nuevasCoordenadasX;
    } 
    /**
     *  <p1> Metodo para rotar las coordenadas en la parte de las Y el angulo deseado </p1>
     * @param coordenadasX  Las coordenadas iniciales en la parte de X
     * @param coordenadasY  Las coordenadas iniciales en la parte de Y
     * @param angulo El angulo que se desea rotar en Degrees
     * @return  Las coordenadas en la parte de la Y rotada
     */
    public static int[] rotarY(int[] coordenadasX, int[] coordenadasY, float angulo) {
        double radianes = Math.toRadians(angulo);
        int[] nuevasCoordenadasY = new int[coordenadasX.length];
        for (int i = 0; i < coordenadasX.length; i++) {
            nuevasCoordenadasY[i] = (int) (coordenadasY[i] * Math.cos(radianes) - coordenadasX[i] * Math.sin(radianes));

        }
        return nuevasCoordenadasY;
    }
    /**
     * <p1> Metodo para desplazar x candidad de pixeles de las coordenadas en x </p1>
     * @param coordenadasX Las coordenadas iniciales
     * @param desplaciamiento La cantidad de puntos que se quiere desplazar las coordenadas iniciales
     * @return Las coordenadas desplazadas
     */
    public static int[] desplasarX(int[] coordenadasX, int desplaciamiento) {
        int[] coordenadasXDes = new int[coordenadasX.length];
        for (int i = 0; i < coordenadasXDes.length; i++) {
            coordenadasXDes[i] = coordenadasX[i] + desplaciamiento;
        }
        return coordenadasXDes;
    }
    /**
     * <p1> Metodo para desplazar y candidad de pixeles de las coordenadas en y </p1>
     * @param coordenadasY Las coordenadas iniciales
     * @param desplaciamiento La cantidad de puntos que se quiere desplazar las coordenadas iniciales
     * @return Las coordenadas desplazadas 
     */
    public static int[] desplasarY(int[] coordenadasY, int desplaciamiento) {
        int[] coordenadasYDes = new int[coordenadasY.length];
        for (int i = 0; i < coordenadasYDes.length; i++) {
            coordenadasYDes[i] = coordenadasY[i] + desplaciamiento;
        }
        return coordenadasYDes;
    }
}