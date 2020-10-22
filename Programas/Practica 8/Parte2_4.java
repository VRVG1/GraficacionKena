import java.awt.*;
public class Parte2_4 extends PlanoCartesiano{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //original
        int[] px = {-80,80,-80,80};
        int[] py = {80,80,-80,-80};
        dibujarPN(px, py, g, 1, 1);
        //A
        g.setColor(Color.red);
        dibujarPN(px, py, g, 2, 2);
        //B
        g.setColor(Color.blue);
        dibujarPN(rotarX(px, py, 45), rotarY(px, py, 45), g, 1, 1);
        //C
        g.setColor(Color.pink);
        dibujarPN(px, py, g, 1, 0.5);
        //D
        g.setColor(new Color(143,102,68));
        dibujarPN(desplasarX(px, 50), desplasarY(py, -25), g, 1, 1);
        //E
        g.setColor(Color.magenta);
        dibujarPN(rotarX(px, py, 90), rotarY(px, py, 90), g, 1, 1);
        //f
        g.setColor(Color.orange);
        dibujarPN(px, py, g, 1.5, 1);
        //g
        g.setColor(Color.green);
        dibujarPN(desplasarX(px, 20), desplasarY(py, 40), g, 1, 1);

    }
}
