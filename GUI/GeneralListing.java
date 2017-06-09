package GUI;

//import  GUI.Window.csv;
import algorithmsproyect.MethodsForCSVFile;
import algorithmsproyect.Node;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GeneralListing extends JInternalFrame {

    private JTable table;
    private JScrollPane scrollPane;
    MethodsForCSVFile csv;

    public GeneralListing() {
        super("General listing", false, true, false);
        this.setLayout(new BorderLayout());
        
        csv = new MethodsForCSVFile("datos.csv");
        csv.readCSVFile();

        String[] columnNames = {"Code", "Title", "Gender", "Total", "Subtitled", "Premier"};

        String[][] data = new String[csv.totallist.size][6];

        Node ptr = csv.totallist.start;

        int i = 0, j = 0;

        while (ptr.getLinkNext() != csv.totallist.start) {
            if (ptr.getData().getGender().equals("1000")) {
                ptr.getData().setGender("Drama");
            }
            if (ptr.getData().getGender().equals("2000")) {
                ptr.getData().setGender("Comedy");
            }
            if (ptr.getData().getGender().equals("3000")) {
                ptr.getData().setGender("Childish");
            }
            if (ptr.getData().getGender().equals("4000")) {
                ptr.getData().setGender("Action");
            }
            if (ptr.getData().getGender().equals("5000")) {
                ptr.getData().setGender("Romance");
            }
            if (ptr.getData().getGender().equals("6000")) {
                ptr.getData().setGender("Fiction");
            }

            data[j][0] = String.valueOf(ptr.getData().getCode());
            data[j][1] = String.valueOf(ptr.getData().getTitle());
            data[j][2] = String.valueOf(ptr.getData().getGender());
            data[j][3] = String.valueOf(String.valueOf(ptr.getData().getTotal()));
            data[j][4] = String.valueOf(String.valueOf(ptr.getData().getSubtitled()));
            data[j][5] = String.valueOf(String.valueOf(ptr.getData().getPremier()));

            i++;
            j++;
            ptr = ptr.getLinkNext();
        }//while

        data[j][0] = String.valueOf(csv.totallist.end.getData().getCode());
        data[j][1] = String.valueOf(csv.totallist.end.getData().getTitle());
        data[j][2] = String.valueOf(ptr.getData().getGender());
        data[j][3] = String.valueOf(String.valueOf(csv.totallist.end.getData().getTotal()));
        data[j][4] = String.valueOf(String.valueOf(csv.totallist.end.getData().getSubtitled()));
        data[j][5] = String.valueOf(String.valueOf(csv.totallist.end.getData().getPremier()));

        this.table = new JTable(data, columnNames);
        this.scrollPane = new JScrollPane(table);

        this.table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        this.scrollPane = new JScrollPane(this.table);
        getContentPane().add(this.scrollPane, BorderLayout.CENTER);

        this.setVisible(false);
        this.setSize(1200, 580);
        this.setLocation(0, 20);
    }

} // class
