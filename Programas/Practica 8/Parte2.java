import java.awt.*;
public class Parte2 extends PlanoCartesiano{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int ax[] = {(int)(origenX + (-30 * escalarX)),(int)(origenX + (30 * escalarX)),(int)(origenX + (45 * escalarX)),(int)(origenX + (-45 * escalarX))};
        int ay[] = {(int)(origenY - (30 * escalarY)),(int)(origenY - (30 * escalarY)),(int)(origenY - (-30 * escalarY)),(int)(origenY - (-30 * escalarY))}; 

        g.fillPolygon(ax, ay, ax.length);

        /**
         * Parte a sera de color Azul
         */
        g.setColor(Color.blue);
        int tx = 90;
        int ty = -150;
        int ax1[] = {(int)(origenX + ((-30 + tx) * escalarX)),(int)(origenX + ((30 + tx) * escalarX)),(int)(origenX + ((45 + tx) * escalarX)),(int)(origenX + ((-45 + tx) * escalarX))};
        int ay1[] = {(int)(origenY - ((30 + ty) * escalarY)),(int)(origenY - ((30 + ty) * escalarY)),(int)(origenY - ((-30 + ty) * escalarY)),(int)(origenY - ((-30 + ty) * escalarY))}; 

        g.fillPolygon(ax1, ay1, ax1.length);

        /**
        * Parte b sera de color　緑
         */
        g.setColor(Color.GREEN);
        tx = -100;
        ty = 70;
        int ax2[] = {(int)(origenX + ((-30 + tx) * escalarX)),(int)(origenX + ((30 + tx) * escalarX)),(int)(origenX + ((45 + tx) * escalarX)),(int)(origenX + ((-45 + tx) * escalarX))};
        int ay2[] = {(int)(origenY - ((30 + ty) * escalarY)),(int)(origenY - ((30 + ty) * escalarY)),(int)(origenY - ((-30 + ty) * escalarY)),(int)(origenY - ((-30 + ty) * escalarY))}; 

        g.fillPolygon(ax2, ay2, ax2.length);
    }
}
