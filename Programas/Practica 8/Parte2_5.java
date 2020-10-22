import java.awt.*;
public class Parte2_5 extends PlanoCartesiano {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //original
        g.setColor(new Color(14,168,7));
        int[] px = {80,-80,-80,80};
        int[] py = {80,80,-80,-80};
        dibujarPN(px, py, g, 1, 1);
        
        for (int i = 0; i < 4; i++) {
            dibujarPN(desplasarX(px, 30 * i), desplasarY(py, 30 * i), g, 1, 1);
        }

    }
}
