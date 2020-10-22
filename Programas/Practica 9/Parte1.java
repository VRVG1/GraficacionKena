import java.awt.*;
public class Parte1 extends PlanoCartesiano {
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(0,0,0));
        int[] px = {100,150,225,225,75,75,100};
        int[] py = {150,175,175,250,250,175,175};

		dibujarPN(px, py, g, 1, 1);
		g.setColor(Color.BLUE);
		dibujarPN(px, EspejoEjeX(py), g, 1, 1);
		g.setColor(Color.pink);
		dibujarPN(EspejoEjeY(px), py, g, 1, 1);
		g.setColor(Color.GREEN);
		dibujarPN(EspejoEjeY(px), EspejoEjeX(py), g, 1, 1);
		g.setColor(Color.CYAN);
		dibujarPN(Rotar90GrdosX(py), Rotar90GrdosY(px), g, 1, 1);
		dibujarPN(Rotar90GrdosXNega(py), Rotar90GrdosYNega(px), g, 1, 1);
	}
}