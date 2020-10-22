import java.awt.*;
public class Parte2_3 extends PlanoCartesiano{
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //original
        int[] px = {100,100,175,100,100,-100,-50,-100};
        int[] py = {50, 75, 0, -75,-50,-50,0,50};
        dibujarPN(px, py, g, 1, 1);

        int[] angulos = {45,90,135,180};
        //Inciso A
        g.setColor(Color.red);
        dibujarPN(rotarX(px, py, angulos[0]), rotarY(px, py, angulos[0]), g, 1, 1);
        dibujarPN(rotarX(px, py, angulos[1]), rotarY(px, py, angulos[1]), g, 1, 1);
        dibujarPN(rotarX(px, py, angulos[2]), rotarY(px, py, angulos[2]), g, 1, 1);
        dibujarPN(rotarX(px, py, angulos[3]), rotarY(px, py, angulos[3]), g, 1, 1);
        //Inciso B
        g.setColor(Color.BLUE);
        int[] px1 = new int[px.length];
        int[] py1 = new int[py.length];
        for (int i = 0; i < px.length; i++) {
            px1[i] = px[i] + 50;
            py1[i] = py[i];
        }
        dibujarPN(rotarX(px1, py1, angulos[0]), rotarY(px1, py1, angulos[0]), g, 1, 1);
        dibujarPN(rotarX(px1, py1, angulos[1]), rotarY(px1, py1, angulos[1]), g, 1, 1);
        dibujarPN(rotarX(px1, py1, angulos[2]), rotarY(px1, py1, angulos[2]), g, 1, 1);
        dibujarPN(rotarX(px1, py1, angulos[3]), rotarY(px1, py1, angulos[3]), g, 1, 1);
        //Inciso C
        g.setColor(Color.cyan);
        int[] px2 = new int[px1.length];
        int[] py2 = new int[py1.length];
        for (int i = 0; i < px1.length; i++) {
            px2[i] = px1[i] + 175;
            py2[i] = py1[i];
        }
        dibujarPN(rotarX(px2, py2, angulos[0]), rotarY(px2, py2, angulos[0]), g, 1, 1);
        dibujarPN(rotarX(px2, py2, angulos[1]), rotarY(px2, py2, angulos[1]), g, 1, 1);
        dibujarPN(rotarX(px2, py2, angulos[2]), rotarY(px2, py2, angulos[2]), g, 1, 1);
        dibujarPN(rotarX(px2, py2, angulos[3]), rotarY(px2, py2, angulos[3]), g, 1, 1);
        //incico D
        g.setColor(Color.green);
        int[] px3 = new int[px2.length];
        int[] py3 = new int[py2.length];
        for (int i = 0; i < px1.length; i++) {
            px3[i] = px2[i] + 50;
            py3[i] = py2[i] + 300;
        }
        dibujarPN(rotarX(px3, py3, angulos[0]), rotarY(px3, py3, angulos[0]), g, 1, 1);
        dibujarPN(rotarX(px3, py3, angulos[1]), rotarY(px3, py3, angulos[1]), g, 1, 1);
        dibujarPN(rotarX(px3, py3, angulos[2]), rotarY(px3, py3, angulos[2]), g, 1, 1);
        dibujarPN(rotarX(px3, py3, angulos[3]), rotarY(px3, py3, angulos[3]), g, 1, 1);
    }
}