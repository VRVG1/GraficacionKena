import java.awt.Graphics;
import java.util.Arrays;

public class Parte4 extends PlanoCartesiano {
    Transformaciones t = new Transformaciones();

    double x[] = { 60, 110, 160 };
    double y[] = { 60, 160, 60 };
    double kx = 1;
    double ky = 1;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        final double[][] yes = t.matrizPutos(x, y);
        try {
            dibujarPN(t.newPoints(yes, 0), t.newPoints(yes, 1), g, 1, 1);
            Thread.sleep(1000);
            double[][] marinero = t.reflexionX(yes);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.reflexionY(yes);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.reflexionXY(yes);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.reflexionXigualY(yes);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.reflexionXigualYInverso(yes);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.recorteX(yes, 2);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.recorteX(yes, 2, -40);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.recorteY(yes, 2);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
            marinero = t.recorteY(yes, 2, -40);
            dibujarPN(t.newPoints(marinero, 0), t.newPoints(marinero, 1), g, kx, ky);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
