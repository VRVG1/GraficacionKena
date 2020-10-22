import java.sql.Array;
import java.util.Arrays;

/**
 * Transformaciones
 */
public class Transformaciones {

    public double[][] multiplicacion(double a[][], double b[][]) {
        double resultado[][] = new double[a.length][b[0].length];
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int j2 = 0; j2 < a[0].length; j2++) {
                        resultado[i][j] += a[i][j2] * b[j2][j];
                    }
                }
            }
        }
        return resultado;
    }

    public double[][] matrizPutos(double[] x, double[] y) {
        double[][] vergas = new double[3][x.length];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == 0) {
                    vergas[0][j] = x[j];
                } else if (i == 1) {
                    vergas[1][j] = y[j];
                } else if (i == 2) {
                    vergas[2][j] = 1;
                }
            }
        }
        return vergas;
    }

    public int[] newPoints(double ahooy[][], int coordenadas) {
        int arrr[] = new int[ahooy[0].length];
        if (coordenadas == 0) {
            for (int i = 0; i < arrr.length; i++) {
                arrr[i] = (int) ahooy[0][i];
            }
        } else {
            for (int i = 0; i < arrr.length; i++) {
                arrr[i] = (int) ahooy[1][i];
            }
        }
        return arrr;
    }

    public double[][] translation(double tx, double ty) {
        double[][] Tidentidad = { { 1, 0, tx }, { 0, 1, ty }, { 0, 0, 1 } };
        return Tidentidad;
    }

    public double[][] translationIn(double tx, double ty) {
        double[][] Tidentidad = { { 1, 0, -tx }, { 0, 1, -ty }, { 0, 0, 1 } };
        return Tidentidad;
    }

    public double[][] escalacion(double sx, double sy) {
        double[][] Tidentidad = { { sx, 0, 0 }, { 0, sy, 0 }, { 0, 0, 1 } };
        return Tidentidad;
    }

    // nel no entiendo xd
    public double[][] escalacion(double x, double y, double sx, double sy) {
        double[][] Tidentidad = { { sx, 0, x * (1 - sx) }, { 0, sy, y * (1 - sy) }, { 0, 0, 1 } };
        return Tidentidad;
    }

    public double[][] escalacionIn(double sx, double sy) {
        if (sx == 0) {
            sx = 1;
        }
        if (sy == 0) {
            sy = 1;
        }
        double[][] Tidentidad = { { 1 / sx, 0, 0 }, { 0, 1 / sy, 0 }, { 0, 0, 1 } };
        return Tidentidad;
    }

    public double[][] rotacion(double g) {
        g = Math.toRadians(g);
        double[][] Tidentidad = { { Math.cos(g), -Math.sin(g), 0 }, { Math.sin(g), Math.cos(g), 0 }, { 0, 0, 1 } };
        return Tidentidad;
    }

    public double[][] rotacion(double xp, double yp, double g) {
        g = Math.toRadians(g);
        double[][] Tidentidad = { { Math.cos(g), -Math.sin(g), xp * (1 - Math.cos(g)) + (yp * Math.sin(g)) },
                { Math.sin(g), Math.cos(g), yp * (1 - Math.cos(g)) - (xp * Math.sin(g)) }, { 0, 0, 1 } };
        return Tidentidad;
    }

    public double[][] rotacionIn(double g) {
        g = Math.toRadians(g);
        double[][] Tidentidad = { { Math.cos(g), Math.sin(g), 0 }, { -Math.sin(g), Math.cos(g), 0 }, { 0, 0, 1 } };
        return Tidentidad;
    }
    // Reflexion y Recorte

    public double[][] reflexionX(double[][] sensho) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[0].length; i++) {
            arrr[0][i] = -sensho[0][i];
            arrr[1][i] = sensho[1][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] reflexionY(double[][] sensho) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[1].length; i++) {
            arrr[1][i] = -sensho[1][i];
            arrr[0][i] = sensho[0][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] reflexionXY(double[][] sensho) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[0].length; i++) {
            arrr[0][i] = -sensho[0][i];
            arrr[1][i] = -sensho[1][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] reflexionXigualY(double[][] sensho) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[0].length; i++) {
            arrr[1][i] = sensho[0][i];
            arrr[0][i] = sensho[1][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] reflexionXigualYInverso(double[][] sensho) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[0].length; i++) {
            arrr[1][i] = -sensho[0][i];
            arrr[0][i] = -sensho[1][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] recorteX(double[][] sensho, double shx) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[0].length; i++) {
            arrr[0][i] = sensho[0][i] + shx * sensho[1][i];
            arrr[1][i] = sensho[1][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] recorteX(double[][] sensho, double shx, double yref) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[0].length; i++) {
            arrr[0][i] = sensho[0][i] + shx * (sensho[1][i] - yref);
            arrr[1][i] = sensho[1][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] recorteY(double[][] sensho, double shy) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[1].length; i++) {
            arrr[1][i] = sensho[1][i] + shy * sensho[0][i];
            arrr[0][i] = sensho[0][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }

    public double[][] recorteY(double[][] sensho, double shy, double xref) {
        double arrr[][] = new double[3][sensho.length];
        for (int i = 0; i < sensho[0].length; i++) {
            arrr[1][i] = sensho[1][i] + shy * (sensho[0][i] - xref);
            arrr[0][i] = sensho[0][i];
            arrr[2][i] = sensho[2][i];
        }
        return arrr;
    }
}