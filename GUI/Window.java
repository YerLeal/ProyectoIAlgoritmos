package GUI;

import algorithmsproyect.MethodsForCSVFile;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Window extends JFrame implements ActionListener {
    
    private GeneralListing generalListing;
    private WindowList windowList;
    private Search search;
    private InsertMovieInFile insertMovieInFile;
    private SelectCategory selectCategory;
    
    static Desktop desktop;
    private JMenuBar menuBar;
    private JMenu jmPeliculas;
    private JMenuItem jmiInsertarPelicula, jmiBuscarPelicula, jmiCargarListas, jmiListadoGeneral;
    
    MethodsForCSVFile csv;
    
    public Window() {
        super("Proyecto 1: Uso de lista doblemente enlazada");
        this.setLayout(new BorderLayout());
        this.desktop = new Desktop();
        
        this.init();
        this.add(this.desktop);
        
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 600);
    }
    
    private void init() {
        this.generalListing = new GeneralListing();
        this.desktop.add(this.generalListing);
        this.windowList = new WindowList("");
        this.desktop.add(this.windowList);
        this.search = new Search();
        this.desktop.add(this.search);
        this.insertMovieInFile = new InsertMovieInFile();
        this.desktop.add(this.insertMovieInFile);
        this.selectCategory = new SelectCategory();
        this.desktop.add(this.selectCategory);
        
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
        this.menuBar.setSize(1200, 20);
        
    } // init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.jmiInsertarPelicula) {
            if(!this.insertMovieInFile.isShowing()){
                this.insertMovieInFile = new InsertMovieInFile();
                this.insertMovieInFile.setVisible(true);
                this.desktop.add(this.insertMovieInFile);
            }   
        } else if (e.getSource() == this.jmiBuscarPelicula) {
            if (!this.search.isShowing()) {
                this.search = new Search();
                this.search.setVisible(true);
                this.desktop.add(this.search);
            }
        } else if (e.getSource() == this.jmiListadoGeneral) {
            if (!this.generalListing.isShowing()) {
                this.generalListing = new GeneralListing();
                this.generalListing.setVisible(true);
                this.desktop.add(this.generalListing);
            }
        } else if (!this.windowList.isShowing()) {
            this.selectCategory = new SelectCategory();
            this.selectCategory.setVisible(true);
            this.desktop.add(this.selectCategory);
        }
    } // actionPerformed
    
} // class
