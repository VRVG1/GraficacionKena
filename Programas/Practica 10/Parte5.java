import java.awt.Graphics;
import java.awt.*;
public class Parte5 extends PlanoCartesiano {
    Transformaciones t = new Transformaciones();
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        double x[] = { 60, 110, 160 };
        double y[] = { 60, 160, 60 };
        double kx = 1;
        double ky = 1;
        double[][] yes = t.matrizPutos(x, y);
        try{
            dibujarPN(t.newPoints(yes, 0), t.newPoints(yes, 1), g, kx, ky);
            Thread.sleep(1000);
            g.setColor(new Color(34,126,96));
            double[][] hhhh = t.multiplicacion(t.translation(10, 10), yes);
            dibujarPN(t.newPoints(hhhh, 0), t.newPoints(hhhh, 1), g, kx, ky);
            Thread.sleep(1000);
            Thread.sleep(1000);
            g.setColor(new Color(234,226,196));
            hhhh = t.multiplicacion(t.rotacion(110, 110, 43), hhhh);
            dibujarPN(t.newPoints(hhhh, 0), t.newPoints(hhhh, 1), g, kx, ky);
            Thread.sleep(1000);
            Thread.sleep(1000);
            g.setColor(new Color(137,222,111));
            hhhh = t.multiplicacion(t.rotacion(98), hhhh);
            dibujarPN(t.newPoints(hhhh, 0), t.newPoints(hhhh, 1), g, kx, ky);
            Thread.sleep(1000);
            g.setColor(new Color(212,235,200));
            hhhh = t.multiplicacion(t.escalacion(2,2), hhhh);
            dibujarPN(t.newPoints(hhhh, 0), t.newPoints(hhhh, 1), g, kx, ky);
            Thread.sleep(1000);
            g.setColor(new Color(200,200,200));
            hhhh = t.multiplicacion(t.escalacion(100,-100,.5,.5), hhhh);
            dibujarPN(t.newPoints(hhhh, 0), t.newPoints(hhhh, 1), g, kx, ky);
            Thread.sleep(1000);
            g.setColor(new Color(100,100,100));
            hhhh = t.multiplicacion(t.translation(200,-200), hhhh);
            dibujarPN(t.newPoints(hhhh, 0), t.newPoints(hhhh, 1), g, kx, ky);
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
