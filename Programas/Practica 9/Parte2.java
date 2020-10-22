import java.awt.*;
public class Parte2 extends PlanoCartesiano {
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(0,0,0));
        int[] px = {200,300,350,300,200,150};
        int[] py = {280,280,200,120,120,200};
        int kx = 1;
        int ky = 1;
        float shx = 0.5f;
        float shy = 0.5f;
        float xref = -1;
        float yref = -2;
        dibujarPN(px, py, g, kx, ky);
        g.setColor(Color.BLUE);
        dibujarPN(recorteX(px, py, shx), py, g, kx, ky);
        g.setColor(new Color(254,15,52));
        dibujarPN(recorteX2(px, py, shx, yref), py, g, kx, ky);
        g.setColor(new Color(50,10,30));
        dibujarPN(px, recorteY(px, py, shy), g, kx, ky);
        g.setColor(new Color(145,100,250));
        dibujarPN(px, recorteX2(px, py, shx, xref), g, kx, ky);
	}
}