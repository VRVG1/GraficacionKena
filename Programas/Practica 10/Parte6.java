import java.awt.Graphics;
import java.awt.*;
public class Parte6 extends PlanoCartesiano {
    Transformaciones t = new Transformaciones();
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        double x[] = { 60, 110, 160 };
        double y[] = { 60, 160, 60 };
        double kx = 1;
        double ky = 1;
        double[][] yes = t.matrizPutos(x, y);
        dibujarPN(t.newPoints(yes, 0), t.newPoints(yes, 1), g, kx, ky);
        double[][] poiuio = t.multiplicacion(t.translation(89, 98), t.escalacion(2, 2));
        poiuio = t.multiplicacion(t.rotacion(66), poiuio);
        poiuio = t.multiplicacion(t.recorteX(poiuio, 2), poiuio);
        poiuio = t.multiplicacion(t.reflexionXigualYInverso(poiuio), poiuio);
        t.multiplicacion(poiuio, yes);
        g.setColor(Color.ORANGE);
        dibujarPN(t.newPoints(poiuio, 0), t.newPoints(poiuio, 1), g, kx, ky);
    }
}
