import java.awt.*;
public class Parte2_1 extends PlanoCartesiano{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int ax[] = {(int)(origenX + (0 * escalarX)),(int)(origenX + (-50 * escalarX)),(int)(origenX + (0 * escalarX)),(int)(origenX + (50 * escalarX))};
        int ay[] = {(int)(origenY - (65 * escalarY)),(int)(origenY - (0 * escalarY)),(int)(origenY - (-65 * escalarY)),(int)(origenY - (0 * escalarY))}; 

        g.fillPolygon(ax, ay, ax.length);

        /**
         * Parte a sera de color Azul
         */
        g.setColor(Color.blue);
        int tx = 0;
        int ty = 20;
        int ax1[] = {(int)(origenX + ((0 + tx) * escalarX)),(int)(origenX + ((-50 + tx) * escalarX)),(int)(origenX + ((0 + tx) * escalarX)),(int)(origenX + ((50 + tx) * escalarX))};
        int ay1[] = {(int)(origenY - ((65 + ty) * escalarY)),(int)(origenY - ((0 + ty) * escalarY)),(int)(origenY - ((-65 + ty) * escalarY)),(int)(origenY - ((0 + ty) * escalarY))}; 

        g.fillPolygon(ax1, ay1, ax1.length);

        /**
        * Parte b sera de color　緑
         */
        g.setColor(Color.GREEN);
        tx = 20;
        ty = -50;
        int ax2[] = {(int)(origenX + ((0 + tx) * escalarX)),(int)(origenX + ((-50 + tx) * escalarX)),(int)(origenX + ((0 + tx) * escalarX)),(int)(origenX + ((50 + tx) * escalarX))};
        int ay2[] = {(int)(origenY - ((65 + ty) * escalarY)),(int)(origenY - ((0 + ty) * escalarY)),(int)(origenY - ((-65 + ty) * escalarY)),(int)(origenY - ((0 + ty) * escalarY))}; 

        g.fillPolygon(ax2, ay2, ax2.length);

        /**
        * Parte c sera de color　赤
         */
        g.setColor(Color.RED);
        tx = 30;
        ty = 75;
        int ax3[] = {(int)(origenX + ((0 + tx) * escalarX)),(int)(origenX + ((-50 + tx) * escalarX)),(int)(origenX + ((0 + tx) * escalarX)),(int)(origenX + ((50 + tx) * escalarX))};
        int ay3[] = {(int)(origenY - ((65 + ty) * escalarY)),(int)(origenY - ((0 + ty) * escalarY)),(int)(origenY - ((-65 + ty) * escalarY)),(int)(origenY - ((0 + ty) * escalarY))}; 

        g.fillPolygon(ax3, ay3, ax3.length);
    }
}
