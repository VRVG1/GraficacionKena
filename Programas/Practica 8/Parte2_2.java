import java.awt.*;
public class Parte2_2 extends PlanoCartesiano{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int ax[] = {(int)(origenX + (-100 * escalarX)),(int)(origenX + (-20 * escalarX)),(int)(origenX + (0 * escalarX)),(int)(origenX + (20 * escalarX)), (int)(origenX + (100 * escalarX)), (int)(origenX + (20 * escalarX)), (int)(origenX + (0 * escalarX)), (int)(origenX + (-20 * escalarX))};
        int ay[] = {(int)(origenY - (0 * escalarY)),(int)(origenY - (20 * escalarY)),(int)(origenY - (100 * escalarY)),(int)(origenY - (20 * escalarY)), (int)(origenY - (0 * escalarY)), (int)(origenY - (-20 * escalarY)), (int)(origenY - (-100 * escalarY)), (int)(origenY - (-20 * escalarY))}; 
        g.drawPolygon(ax, ay, ax.length);
        //Inciso A

        g.setColor(Color.blue);
        float sx = 2;
        float sy = 2;
        int ax1[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay1[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax1, ay1, ax1.length);


        g.setColor(Color.GREEN);
        sx = 0.5f;
        sy = 0.5f;
        int ax2[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay2[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax2, ay2, ax2.length);


        g.setColor(Color.RED);
        sx = 1.5f;
        sy = 0.5f;
        int ax3[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay3[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax3, ay3, ax3.length);


        g.setColor(Color.PINK);
        sx = 0.5f;
        sy = 1.5f;
        int ax4[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay4[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax4, ay4, ax3.length);

        //Inciso B pero como mi figura esta en el centro es lo mismo que el inciso A


        g.setColor(Color.blue);
        sx = 2;
        sy = 2;
        int ax5[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay5[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax5, ay5, ax5.length);


        g.setColor(Color.GREEN);
        sx = 0.5f;
        sy = 0.5f;
        int ax6[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay6[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax6, ay6, ax6.length);


        g.setColor(Color.RED);
        sx = 1.5f;
        sy = 0.5f;
        int ax7[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay7[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax7, ay7, ax7.length);


        g.setColor(Color.PINK);
        sx = 0.5f;
        sy = 1.5f;
        int ax20[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay20[] = {(int)(origenY - (0 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))),(int)(origenY - (100 * (escalarY * sy))),(int)(origenY - (20 * (escalarY * sy))), (int)(origenY - (0 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy))), (int)(origenY - (-100 * (escalarY * sy))), (int)(origenY - (-20 * (escalarY * sy)))}; 

        g.drawPolygon(ax20, ay20, ax20.length);

        //Inciso C
        int mover = 100;

        g.setColor(Color.blue);
        sx = 2;
        sy = 2;
        int ax9[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay9[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)}; 

        g.drawPolygon(ax9, ay9, ax9.length);


        g.setColor(Color.GREEN);
        sx = 0.5f;
        sy = 0.5f;
        int ax10[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay10[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)};

        g.drawPolygon(ax10, ay10, ax10.length);


        g.setColor(Color.RED);
        sx = 1.5f;
        sy = 0.5f;
        int ax11[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay11[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)};

        g.drawPolygon(ax11, ay11, ax11.length);


        g.setColor(Color.PINK);
        sx = 0.5f;
        sy = 1.5f;
        int ax12[] = {(int)(origenX + (-100 * (escalarX * sx))),(int)(origenX + (-20 * (escalarX * sx))),(int)(origenX + (0 * (escalarX * sx))),(int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (100 * (escalarX * sx))), (int)(origenX + (20 * (escalarX * sx))), (int)(origenX + (0 * (escalarX * sx))), (int)(origenX + (-20 * (escalarX * sx)))};
        int ay12[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)};

        g.drawPolygon(ax12, ay12, ax12.length);

        //Inciso D
        mover = 200;
        int mover2 = 200;

        g.setColor(Color.blue);
        sx = 2;
        sy = 2;
        int ax13[] = {(int)(origenX + (-100 * (escalarX * sx)) + mover2),(int)(origenX + (-20 * (escalarX * sx)) + mover2),(int)(origenX + (0 * (escalarX * sx)) + mover2),(int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (100 * (escalarX * sx)) + mover2), (int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (0 * (escalarX * sx)) + mover2), (int)(origenX + (-20 * (escalarX * sx)) + mover2)};
        int ay13[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)};

        g.drawPolygon(ax13, ay13, ax13.length);


        g.setColor(Color.GREEN);
        sx = 0.5f;
        sy = 0.5f;
        int ax14[] = {(int)(origenX + (-100 * (escalarX * sx)) + mover2),(int)(origenX + (-20 * (escalarX * sx)) + mover2),(int)(origenX + (0 * (escalarX * sx)) + mover2),(int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (100 * (escalarX * sx)) + mover2), (int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (0 * (escalarX * sx)) + mover2), (int)(origenX + (-20 * (escalarX * sx)) + mover2)};
        int ay14[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)};

        g.drawPolygon(ax14, ay14, ax14.length);


        g.setColor(Color.RED);
        sx = 1.5f;
        sy = 0.5f;
        int ax15[] = {(int)(origenX + (-100 * (escalarX * sx)) + mover2),(int)(origenX + (-20 * (escalarX * sx)) + mover2),(int)(origenX + (0 * (escalarX * sx)) + mover2),(int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (100 * (escalarX * sx)) + mover2), (int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (0 * (escalarX * sx)) + mover2), (int)(origenX + (-20 * (escalarX * sx)) + mover2)};
        int ay15[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)};

        g.drawPolygon(ax15, ay15, ax15.length);


        g.setColor(Color.PINK);
        sx = 0.5f;
        sy = 1.5f;
        int ax16[] = {(int)(origenX + (-100 * (escalarX * sx)) + mover2),(int)(origenX + (-20 * (escalarX * sx)) + mover2),(int)(origenX + (0 * (escalarX * sx)) + mover2),(int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (100 * (escalarX * sx)) + mover2), (int)(origenX + (20 * (escalarX * sx)) + mover2), (int)(origenX + (0 * (escalarX * sx)) + mover2), (int)(origenX + (-20 * (escalarX * sx)) + mover2)};
        int ay16[] = {(int)(origenY - (0 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover),(int)(origenY - (100 * (escalarY * sy)) + mover),(int)(origenY - (20 * (escalarY * sy)) + mover), (int)(origenY - (0 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover), (int)(origenY - (-100 * (escalarY * sy)) + mover), (int)(origenY - (-20 * (escalarY * sy)) + mover)};

        g.drawPolygon(ax16, ay16, ax16.length);
    }
}