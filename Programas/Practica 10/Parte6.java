import java.awt.Graphics;
import java.util.Arrays;
import java.awt.*;
public class Parte6 extends PlanoCartesiano {
    Transformaciones t = new Transformaciones();
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // double x[] = { 60, 110, 160 };
        // double y[] = { 60, 160, 60 };
        // double kx = 1;
        // double ky = 1;
        // double[][] yes = t.matrizPutos(x, y);
        // dibujarPN(t.newPoints(yes, 0), t.newPoints(yes, 1), g, kx, ky);
        // double[][] poiuio = t.multiplicacion(t.translation(89, 98), t.escalacion(2, 2));
        // poiuio = t.multiplicacion(t.rotacion(66), poiuio);
        // poiuio = t.multiplicacion(t.recorteX(poiuio, 2), poiuio);
        // poiuio = t.multiplicacion(t.reflexionXigualYInverso(poiuio), poiuio);
        // t.multiplicacion(poiuio, yes);
        // g.setColor(Color.ORANGE);
        // dibujarPN(t.newPoints(poiuio, 0), t.newPoints(poiuio, 1), g, kx, ky);

        double ooo = 10;
        double[] pito = {2 * ooo,4 * ooo,3 * ooo};
        double[] vagina = {2 * ooo,2 * ooo,4 * ooo};
        dibujarPN(t.newPoints(t.matrizPutos(pito, vagina), 0), t.newPoints(t.matrizPutos(pito, vagina), 1), g, 1, 1);
        double[][] oi = t.multiplicacion(t.translation(2 * ooo, 10 * ooo),t.matrizPutos(pito, vagina));
        System.out.println(Arrays.deepToString(oi));
        dibujarPN(t.newPoints(oi, 0), t.newPoints(oi, 1), g, 1, 1);
        oi = t.multiplicacion(t.escalacion(5 * ooo, 1.5 * ooo, 2, 2), oi);
        System.out.println(Arrays.deepToString(oi));
        dibujarPN(t.newPoints(oi, 0), t.newPoints(oi, 1), g, 1, 1);
        oi = t.multiplicacion(t.rotacion(5 * ooo, 1.5 * ooo, 45), oi);
        System.out.println(Arrays.deepToString(oi));
        dibujarPN(t.newPoints(oi, 0), t.newPoints(oi, 1), g, 1, 1);
        oi = t.multiplicacion(t.escalacion(5 * ooo, 1.5 * ooo, 2, 0.5), oi);
        System.out.println(Arrays.deepToString(oi));
        dibujarPN(t.newPoints(oi, 0), t.newPoints(oi, 1), g, 1, 1);
        oi = t.multiplicacion(t.translation(-2 * ooo, -4 * ooo), oi);
        dibujarPN(t.newPoints(oi, 0), t.newPoints(oi, 1), g, 1, 1);
        System.out.println(Arrays.deepToString(oi));
    }
}
