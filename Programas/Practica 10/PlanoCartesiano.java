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
    /**
     * <p1> Metodo para hacer que la imagen se ponga de forma espejo respecto <br>
     * al eje y, es dcir, las x se cambian de signo </p>
     * @param py Las coordenadas iniciales de los punto Y
     * @return Regresa un arreglo con las coordenadas en x estan cambiadas de signo
     */
    public static int[] EspejoEjeX(int[] py) {
        int[] pyR = new int[py.length];
        for (int i = 0; i < py.length; i++) {
            pyR[i] = ((-1) * py[i]);
        }
        return pyR;
    }
    /**
     * <p1> Metodo para hacer que la imagen se ponga de forma espejo respecto <br>
     * al eje x, es dcir, las y se cambian de signo </p>
     * @param px Las coordenadas iniciales de los punto X
     * @return Regresa un arreglo con las coordenadas en y estan cambiadas de signo
     */
    public static int[] EspejoEjeY(int[] px) {
        int[] pxR = new int[px.length];
        for (int i = 0; i < px.length; i++) {
            pxR[i] = ((-1) * px[i]);
        }
        return pxR;
    }

    /**
     * <p1> Metodo para hacer que la imagen gire 90 grados a la derecha <br>
     * para las coordenadas en X
     * @param py Las coordenadas iniciales de los punto Y
     * @return Regresa las coordenadas X pero ahora son las Y que epico xd
     */
    public static int[] Rotar90GrdosX(int[] py) {
        int[] pxR = new int[py.length];
        for (int i = 0; i < py.length; i++) {
            pxR[i] = (py[i]);
        }
        return pxR;
    }
    /**
     * <p1> Metodo para hacer que la imagen gire 90 grados a la derecha <br>
     * Para las coordenadas en Y
     * @param px Las coordenadas iniciales de los punto X
     * @return Regresa las coordenadas Y pero ahora son las X que epico xd
     */
    public static int[] Rotar90GrdosY(int[] px) {
        int[] pyR = new int[px.length];
        for (int i = 0; i < px.length; i++) {
            pyR[i] = (px[i]);
        }
        return pyR;
    }


    /**
     * <p1> Metodo para hacer que la imagen gire 90 grados a la derecha <br>
     * para las coordenadas en X y aparte refleha la figura en diagonal
     * @param py Las coordenadas iniciales de los punto Y
     * @return Regresa las coordenadas X pero ahora son las Y cambiadas de sigono que epico xd
     */
    public static int[] Rotar90GrdosXNega(int[] py) {
        int[] pxR = new int[py.length];
        for (int i = 0; i < py.length; i++) {
            pxR[i] = ((-1) * py[i]);
        }
        return pxR;
    }
    /**
     * <p1> Metodo para hacer que la imagen gire 90 grados a la derecha <br>
     * Para las coordenadas en Y y aparte refleha la figura en diagonal
     * @param px Las coordenadas iniciales de los punto X
     * @return Regresa las coordenadas Y pero ahora son las X cambiadas de sigono que epico xd
     */
    public static int[] Rotar90GrdosYNega(int[] px) {
        int[] pyR = new int[px.length];
        for (int i = 0; i < px.length; i++) {
            pyR[i] = ((-1) * px[i]);
        }
        return pyR;
    }
    /**
     * Un recorte de la dirección de x en relación con el eje de x
     * @param px Coordenadas en X
     * @param py Coordenadas en y
     * @param shx Parametro de recorte
     * @return Las coordenadas en X modificadas para hacer el recorte en X
     */
    public static int[] recorteX(int[] px, int[] py, float shx) {
        int[] pxR = new int[px.length];
        for (int i = 0; i < pxR.length; i++) {
            pxR[i] = Math.round(px[i] + shx * ( py[i]));
        }
        return pxR;
    }

    /**
     *  Dirección de x en relación con otras líneas de referencia 
     * @param px Coordenadas en x
     * @param py Coordenadas en y
     * @param shx Parametro de recorte
     * @param yref No se que es
     * @return Las coordenadas en X modificadas para hacer el recorte en X
     */
    public static int[] recorteX2(int[] px, int[] py, float shx, float yref) {
        int[] pxR = new int[px.length];
        for (int i = 0; i < pxR.length; i++) {
            pxR[i] = Math.round(px[i] + shx * (py[i] - yref));
        }
        return pxR;
    }

    /**
     * Dirección de y en relación con el eje de y
     * @param px Coordenadas en X
     * @param py Coordenadas en y
     * @param shy Parametro de recorte
     * @return Las coordenadas en Y modificadas para hacer el recorte en Y
     */
    public static int[] recorteY(int[] px, int[] py, float shy) {
        int[] pyR = new int[px.length];
        for (int i = 0; i < pyR.length; i++) {
            pyR[i] = Math.round(py[i] + shy * px[i]);
        }
        return pyR;
    }

    /**
     *  Dirección de x en relación con otras líneas de referencia 
     * @param px Coordenadas en x
     * @param py Coordenadas en y
     * @param shx Parametro de recorte
     * @param yref No se que es
     * @return Las coordenadas en X modificadas para hacer el recorte en X
     */
    public static int[] recorteY2(int[] px, int[] py, float shy, float xref) {
        int[] pyR = new int[px.length];
        for (int i = 0; i < pyR.length; i++) {
            pyR[i] = Math.round(py[i] + shy * (px[i] - xref));
        }
        return pyR;
    }
}