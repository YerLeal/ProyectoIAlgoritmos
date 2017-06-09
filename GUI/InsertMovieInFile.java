package GUI;

import algorithmsproyect.MethodsForCSVFile;
import algorithmsproyect.Movie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InsertMovieInFile extends JInternalFrame implements ActionListener {

    JLabel jlCode, jlTitle, jlGender, jlTotal, jlSubtitled, jlPremier;
    JTextField jtfCode, jtfTitle, jtfGender, jtfTotal, jtfSubtitled, jtfPremier;
    JButton jbtnSave;
    MethodsForCSVFile csv;

    public InsertMovieInFile() {

        this.setTitle("Insert movie into file");
        this.setClosable(true);
        this.setIconifiable(false);
        this.setMaximizable(false);

        init();

        this.setSize(340, 300);
        this.setLocation(10, 30);
        this.setVisible(false);

    }//constructor

    public void init() {

        this.setLayout(null);

        jlCode = new JLabel("Code:");
        jlTitle = new JLabel("Title:");
        jlGender = new JLabel("Gender:");
        jlTotal = new JLabel("Total:");
        jlSubtitled = new JLabel("Subtitled:");
        jlPremier = new JLabel("Premier:");

        jtfCode = new JTextField();
        jtfTitle = new JTextField();
        jtfGender = new JTextField();
        jtfTotal = new JTextField();
        jtfSubtitled = new JTextField();
        jtfPremier = new JTextField();

        jbtnSave = new JButton("Save");
        jbtnSave.addActionListener(this);

        csv = new MethodsForCSVFile("datos.csv");

        jlCode.setBounds(10, 10, 100, 25);
        jlTitle.setBounds(10, 45, 100, 25);
        jlGender.setBounds(10, 80, 100, 25);
        jlTotal.setBounds(10, 115, 100, 25);
        jlSubtitled.setBounds(10, 150, 100, 25);
        jlPremier.setBounds(10, 185, 100, 25);

        jtfCode.setBounds(120, 10, 150, 25);
        jtfTitle.setBounds(120, 45, 150, 25);
        jtfGender.setBounds(120, 80, 150, 25);
        jtfTotal.setBounds(120, 115, 150, 25);
        jtfSubtitled.setBounds(120, 150, 150, 25);
        jtfPremier.setBounds(120, 185, 150, 25);

        jbtnSave.setBounds(120, 220, 100, 25);

        add(jlCode);
        add(jlTitle);
        add(jlGender);
        add(jlTotal);
        add(jlSubtitled);
        add(jlPremier);

        add(jtfCode);
        add(jtfTitle);
        add(jtfGender);
        add(jtfTotal);
        add(jtfSubtitled);
        add(jtfPremier);

        add(jbtnSave);

    }//init

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnSave) {

            if (!jtfCode.getText().isEmpty() && !jtfTitle.getText().isEmpty() && !jtfGender.getText().isEmpty() && !jtfTotal.getText().isEmpty() && !jtfSubtitled.getText().isEmpty() && !jtfPremier.getText().isEmpty()) {

                if (jtfGender.getText().trim().equals("1000") || jtfGender.getText().trim().equals("2000") || jtfGender.getText().trim().equals("3000") || jtfGender.getText().trim().equals("4000") || jtfGender.getText().trim().equals("5000") || jtfGender.getText().trim().equals("6000")) {

                    try {
                        String title, gender;
                        int code, total, subtitled, premier;

                        title = jtfTitle.getText().trim();
                        gender = jtfGender.getText().trim();

                        code = Integer.parseInt(jtfCode.getText().trim());
                        total = Integer.parseInt(jtfTotal.getText().trim());
                        subtitled = Integer.parseInt(jtfSubtitled.getText().trim());
                        premier = Integer.parseInt(jtfPremier.getText().trim());

                        Movie movie = new Movie(code, title, gender, total, subtitled, premier);

                        csv.inserMovieIntoFile(movie, code);

                        jtfCode.setText("");
                        jtfTitle.setText("");
                        jtfGender.setText("");
                        jtfTotal.setText("");
                        jtfSubtitled.setText("");
                        jtfPremier.setText("");

                    } catch (Exception ae) {
                        JOptionPane.showMessageDialog(this, "Error", "Error", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Empty", "Error", 0);
            }

        }

    }

}//class
