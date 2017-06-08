package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Window extends JFrame implements ActionListener{
    
    private GeneralListing generalListing;
    private WindowList windowList;
    private InformationMovie informationMovie;
    private Search search;
    
    static Desktop desktop;
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
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
    }
    
    private void init(){
        this.generalListing = new GeneralListing();
        this.desktop.add(this.generalListing);
        this.windowList = new WindowList();
        this.desktop.add(this.windowList);
        this.search = new Search();
        this.desktop.add(this.search);
        
        this.menuBar = new JMenuBar();
        this.jmPeliculas = new JMenu("Películas");
        this.jmiInsertarPelicula = new JMenuItem("Insertar película");
        this.jmiBuscarPelicula = new JMenuItem("Buscar película");
        this.jmiListadoGeneral = new JMenuItem("Lista de películas");
        this.jmiCargarListas = new JMenuItem("Cargar listas");
        
        this.menuBar.add(this.jmPeliculas);
            this.jmPeliculas.add(this.jmiInsertarPelicula);
            this.jmPeliculas.add(this.jmiBuscarPelicula);
        this.menuBar.add(this.jmiListadoGeneral);
        this.menuBar.add(this.jmiCargarListas);
        
        this.jmiInsertarPelicula.addActionListener(this);
        this.jmiBuscarPelicula.addActionListener(this);
        this.jmiListadoGeneral.addActionListener(this);
        this.jmiCargarListas.addActionListener(this);
        
        this.desktop.add(this.menuBar);
        this.menuBar.setLocation(0, 0);
        this.menuBar.setSize(850, 20);

    } // init

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jmiInsertarPelicula){
            System.out.println("insertar pelicula");
        }else if(e.getSource() == jmiBuscarPelicula){
            if(!this.search.isShowing()){
                this.search = new Search();
                this.search.setVisible(true);
                this.desktop.add(this.search);
            }
        }else if(e.getSource() == jmiListadoGeneral){
            if(!this.generalListing.isShowing()){
                this.generalListing = new GeneralListing();
                this.generalListing.setVisible(true);
                this.desktop.add(this.generalListing);
            }
        }else{
            if(!this.windowList.isShowing()){
                this.windowList = new WindowList();
                this.windowList.setVisible(true);
                this.desktop.add(this.windowList);
            }
        }
    } // actionPerformed
    
} // class
