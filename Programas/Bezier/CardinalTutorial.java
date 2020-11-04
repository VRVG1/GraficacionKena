import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Simple aplicación para el dibujado de una Spline Cardinal.
 * 
 * @author Jesús Serrato
 */
public class CardinalTutorial {

    private JFrame frame;
    private JPanel panel;
    private JButton botonDibujar;
    private JButton botonBorrar;
    private JToolBar barra;
    private JSpinner spinner;
    private SpinnerModel model;
    private ArrayList<Point> puntos;
    private JSlider slider;
    private JLabel label;

    /**
     * Constructor de la clase sin argumentos
     */
    public CardinalTutorial() {
        
        puntos = new ArrayList<>();
        inicializarComponentes();
        
    }
    
    /**
     * Método para el inicializado de la GUI.
     */
    private void inicializarComponentes() {
    
        this.frame = new JFrame("Splines Cardinales");
        frame.getContentPane().setLayout(new BorderLayout());    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.addMouseListener(
                new MouseAdapter() {

                    @Override
                    public void mousePressed(MouseEvent e) {
                        
                        panel.getGraphics().fillOval(e.getX() - 5, e.getY() - 5, 10, 10);
                        puntos.add(new Point(e.getX(), e.getY()));
                        
                    }
        
                }
                
        );
        
        model = new SpinnerNumberModel(50, 10, 500, 10);
        
        spinner = new JSpinner(model);
        
        slider = new JSlider(-10, 10, 0);
        slider.addChangeListener(
                new ChangeListener() {

                    @Override
                    public void stateChanged(ChangeEvent ce) {
                        double valor = ((double) slider.getValue()) / 10.0;
                        label.setText(valor + "");
                    }
            
                }
        );

        label = new JLabel((((double) slider.getValue()) / 10) + "");
                       
        botonBorrar = new JButton("Borrar");
        botonBorrar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        panel.repaint();
                        puntos.clear();
                        
                    }
        
                }
        );
        
        this.botonDibujar = new JButton("Dibujar");
        this.botonDibujar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        dibujarCardinal(panel.getGraphics(), puntos, (int) model.getValue());
                        puntos.clear();

                    }
        
                }
        );
        
        this.barra = new JToolBar();
        barra.setFloatable(false);
        
        barra.add(botonBorrar);
        barra.add(botonDibujar);
        barra.add(new JSeparator(JSeparator.VERTICAL));
        barra.add(new JLabel("Número de puntos: "));
        barra.add(spinner);
        barra.add(new JSeparator(JSeparator.VERTICAL));
        barra.add(new JLabel("Tension: "));
        barra.add(label);
        barra.add(slider);
        
        frame.add(barra, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);        
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    }

    /**
     * Método para el dibujado de una Spline Cardinal.
     * 
     * @param g - Objeto Graphics
     * @param puntos - Puntos de control de la curva
     * @param numeroPuntos - El número de puntos a dibujar de cada segmento de la curva
     */
    public void dibujarCardinal(Graphics g, ArrayList<Point> puntos, int numeroPuntos) {
            
        double a, b, c, d, u, x, y;      
        ArrayList<Point> anteriores = new ArrayList<>();
        double tension = slider.getValue();

        if (puntos.size() >= 4) {
            for (int k = 1; k < (puntos.size() - 2); k++) {            
                for (double i = 0; i < numeroPuntos; i++) {            
                    u = (double) (i / numeroPuntos);
                    a = (2 * u * u * u) - (3 * u * u) + 1;
                    b = (-2 * u * u * u) + (3 * u * u);
                    c = (u * u * u) - (2 * u * u) + u;
                    d = (u * u * u) - (u * u);           
                    double[] derivadas = calcularDerivadas(puntos.get(k + 1), puntos.get(k), puntos.get(k + 2), puntos.get(k - 1), tension);
                    
                    x = (a * ((double) puntos.get(k).getX())) + (b * ((double) puntos.get(k + 1).getX())) + 
                            (c * ((double) derivadas[0])) + (d * ((double) derivadas[2]));
                    y = (a * ((double) puntos.get(k).getY())) + (b * ((double) puntos.get(k + 1).getY())) + 
                            (c * ((double) derivadas[1])) + (d * ((double) derivadas[3]));
                    
                    g.drawLine((int) x, (int) y, (int) x, (int) y);    
                    anteriores.add(new Point((int) x, (int) y));
                    
                    if (anteriores.size() > 1) {
                        g.drawLine(anteriores.get(anteriores.size() - 2).x, anteriores.get(anteriores.size() - 2).y, (int) x, (int) y);
                        anteriores.remove(0);
                    }
                }
            }
            
            g.drawLine(anteriores.get(anteriores.size() - 1).x, anteriores.get(anteriores.size() - 1).y, 
                puntos.get(puntos.size() - 2).x, puntos.get(puntos.size() - 2).y);
        }
        
    } 
    
    /**
     * Método para el cálculo de las derivadas.
     * 
     * @param p1
     * @param p
     * @param p2
     * @param pMenos
     * @param tension
     * @return 
     */
    private double[] calcularDerivadas(Point p1, Point p, Point p2, Point pMenos, double tension) {
    
        return new double[] {            
            ((1 - tension) * ((double) p1.getX() - (double) pMenos.getX())) / 2,
            ((1 - tension) * ((double) p1.getY() - (double) pMenos.getY())) / 2,
            ((1 - tension) * ((double) p2.getX() - (double) p.getX())) / 2,
            ((1 - tension) * ((double) p2.getY() - (double) p.getY())) / 2
        };
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new CardinalTutorial();
        
    }
    
}