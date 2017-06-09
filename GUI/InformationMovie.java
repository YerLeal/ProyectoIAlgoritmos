package GUI;

import algorithmsproyect.MethodsForCSVFile;
import algorithmsproyect.Movie;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class InformationMovie extends JInternalFrame {

    private JTable table;
    private JScrollPane scrollPane;
    Movie movie;
    MethodsForCSVFile csv;

    public InformationMovie(String nameMovie) {
        super("Information Movie", false, true, false);
        this.setLayout(new BorderLayout());

        csv = new MethodsForCSVFile("datos.csv");
        String line = csv.searchMovie(nameMovie);

        if (!line.equals("")) {

            String [] moviearray = line.split(",");
            
            movie = new Movie(Integer.parseInt(moviearray[0]), moviearray[1], moviearray[2], Integer.parseInt(moviearray[4]), Integer.parseInt(moviearray[4]), Integer.parseInt(moviearray[5]));
            
            String[] columnNames = {"Code", "Title", "Gender", "Total", "Subtitled", "Premier"};

            String[][] data = {{String.valueOf(movie.getCode()), movie.getTitle(), movie.getGender(), String.valueOf(movie.getTotal()), String.valueOf(movie.getSubtitled()), String.valueOf(movie.getPremier())}};

            this.table = new JTable(data, columnNames);

            this.scrollPane = new JScrollPane(table);

            this.table.setPreferredScrollableViewportSize(new Dimension(250, 100));
            this.scrollPane = new JScrollPane(this.table);
            getContentPane().add(this.scrollPane, BorderLayout.CENTER);

        } else {
            JOptionPane.showMessageDialog(this, "The movie not exist", "Error", 0);
        }

        this.setVisible(false);
        this.setSize(500, 400);
        this.setLocation(10, 30);

    }

} // class
