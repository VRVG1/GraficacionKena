import java.awt.Graphics;
import java.sql.Time;
import java.util.Arrays;

public class Parte1 extends PlanoCartesiano {
    Transformaciones t = new Transformaciones();

    double x[] = { 50, 100, 150 };
    double y[] = { 50, 150, 50 };

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        double[][] yes = t.matrizPutos(x, y);
        try {
            dibujarPN(t.newPoints(yes, 0), t.newPoints(yes, 1), g, 1, 1);
            
            Thread.sleep(1000);
            
            double[][] iiii = t.multiplicacion(t.translation(30, -30), yes);
            dibujarPN(t.newPoints(iiii, 0), t.newPoints(iiii, 1), g, 1, 1);

            Thread.sleep(1000);

            iiii = t.multiplicacion(t.translationIn(30, -30), yes);
            dibujarPN(t.newPoints(iiii, 0), t.newPoints(iiii, 1), g, 1, 1);

            Thread.sleep(1000);

            iiii = t.multiplicacion(t.escalacion(3, 3), yes);
            dibujarPN(t.newPoints(iiii, 0), t.newPoints(iiii, 1), g, 1, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}





































































































































































































































































































































































































































































































































































































































































//Maestra si ve esto realmente estoy sorprendido de que revice cada uno de los programas de manera exaustiva. Quiero aclarar que no use los metodos que no dios porque la verdad no entiendo como implementarlos, tengo los metodos, me dan resultados correctos, pero no se como implementarlos ya que me da matrices y yo utilizo vectores asi que no me sierve de nada, aparte de que me dan una dimencion extra por asi decirlo que me arruina todo el codigo, no descarto que estos sean los metodos adecuados para el manejo de figuaras, pero la verdad es que tienes que tener tu plano adaptado a estos metodos y no los metodos adaptarlos al plano porque si no nunca van a funcionar.




































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































