import java.awt.*;
public class Parte1 extends PlanoCartesiano{
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Polygon p = new Polygon();

        p.addPoint((int) (origenX + (0 * escalarX)), (int) (origenY - ((50)) * escalarY));
        p.addPoint((int) (origenX + (50 * escalarX)), (int) (origenY - (-50) * escalarY));
        p.addPoint((int) (origenX + ((-50) * escalarX)), (int) (origenY - (-50) * escalarY));
        g.setColor(Color.blue);
        g.fillPolygon(p);

        g.fillRect((int) (origenX + (50 * escalarX)), (int) (origenY - ((200)) * escalarY), (int) (100 * escalarX),
                (int) (100 * escalarY));
    }
}
