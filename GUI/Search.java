package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Search extends JInternalFrame implements ActionListener {

    private InformationMovie informationMovie;

    private JLabel jlNameMovie;
    private JTextField jtfNameMovie;
    private JButton jbSearch;

    public Search() {
        super("Search Movie", false, true, false);
        this.setLayout(null);

        this.jlNameMovie = new JLabel("Name of the movie");
        this.jtfNameMovie = new JTextField();
        this.jbSearch = new JButton("Search");
        this.jbSearch.addActionListener(this);

        this.jlNameMovie.setSize(200, 20);
        this.jtfNameMovie.setSize(200, 20);
        this.jbSearch.setSize(100, 30);

        this.jlNameMovie.setLocation(20, 20);
        this.jtfNameMovie.setLocation(20, 50);
        this.jbSearch.setLocation(20, 80);

        this.add(jlNameMovie);
        this.add(jtfNameMovie);
        this.add(this.jbSearch);

        this.setVisible(false);
        this.setSize(250, 170);
        this.setLocation(10, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbSearch) {
            showWindowInformation();
        }
    }

    private void showWindowInformation() {
        String name = this.jtfNameMovie.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Espacio vacío","Error",0);
        }else{
            this.informationMovie = new InformationMovie(name);
            this.informationMovie.setVisible(true);
            Window.desktop.add(this.informationMovie);
            this.dispose();
        } 
        
    } // showWindowInformation
    
} // class
