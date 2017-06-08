package GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Window extends JFrame{
    
    private Desktop desktop;
    private JMenuBar menuBar;
    private JMenu jmPeliculas;
    private JMenuItem jmiInsertarPelicula, jmiBuscarPelicula, jmiCargarListas, jmiListadoGeneral;
    
    public Window(){
        super("Proyecto 1: Uso de lista doblemente enlazada");
        this.setLayout(new BorderLayout());
        this.desktop = new Desktop();
        
        this.init();
        this.add(this.desktop);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
    }
    
    private void init(){
        this.menuBar = new JMenuBar();
        this.jmPeliculas = new JMenu("Películas");
        this.jmiInsertarPelicula = new JMenuItem("Insertar película");
        this.jmiBuscarPelicula = new JMenuItem("Buscar película");
        this.jmiListadoGeneral = new JMenuItem("Lista de peliculas");
        this.jmiCargarListas = new JMenuItem("Cargar listas");
        
        this.menuBar.add(this.jmPeliculas);
            this.jmPeliculas.add(this.jmiInsertarPelicula);
            this.jmPeliculas.add(this.jmiBuscarPelicula);
        this.menuBar.add(this.jmiListadoGeneral);
        this.menuBar.add(this.jmiCargarListas);
        
        this.desktop.add(this.menuBar);
        this.menuBar.setLocation(0, 0);
        
        this.menuBar.setSize(850, 20);

    } // init
    
} // class
