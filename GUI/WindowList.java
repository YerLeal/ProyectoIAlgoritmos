package GUI;

import algorithmsproyect.MethodsForCSVFile;
import algorithmsproyect.Node;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowList extends JInternalFrame {

    private MethodsForCSVFile csv;
    private JTable table;
    private JScrollPane scrollPane;

    public WindowList(String genero) {
        super("Window List", false, true, false);
        this.setLayout(new BorderLayout());
        this.csv = new MethodsForCSVFile("datos.csv");
        csv.readCSVFile();

        String[] columnNames = {"Code", "Title", "Gender", "Total", "Subtitled", "Premier"};
        String data[][] = new String[6][6];
        Node ptr;
        int i = 0, j = 0;

        if (genero.equals("Comedy")) {

            data = new String[csv.comedylist.size][6];
            ptr = csv.comedylist.start;
            i = 0;
            j = 0;

            while (ptr.getLinkNext() != csv.comedylist.start) {
                data[j][0] = String.valueOf(ptr.getData().getCode());
                data[j][1] = String.valueOf(ptr.getData().getTitle());
                data[j][2] = String.valueOf(ptr.getData().getGender());
                data[j][3] = String.valueOf(String.valueOf(ptr.getData().getTotal()));
                data[j][4] = String.valueOf(String.valueOf(ptr.getData().getSubtitled()));
                data[j][5] = String.valueOf(String.valueOf(ptr.getData().getPremier()));

                j++;
                ptr = ptr.getLinkNext();
            }//while

            data[j][0] = String.valueOf(csv.comedylist.end.getData().getCode());
            data[j][1] = String.valueOf(csv.comedylist.end.getData().getTitle());
            data[j][2] = String.valueOf(ptr.getData().getGender());
            data[j][3] = String.valueOf(String.valueOf(csv.comedylist.end.getData().getTotal()));
            data[j][4] = String.valueOf(String.valueOf(csv.comedylist.end.getData().getSubtitled()));
            data[j][5] = String.valueOf(String.valueOf(csv.comedylist.end.getData().getPremier()));

        } else if (genero.equals("Childish")) {
            data = new String[csv.childishlist.size][6];
            ptr = csv.childishlist.start;

            while (ptr.getLinkNext() != csv.childishlist.start) {
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

            data[j][0] = String.valueOf(csv.childishlist.end.getData().getCode());
            data[j][1] = String.valueOf(csv.childishlist.end.getData().getTitle());
            data[j][2] = String.valueOf(ptr.getData().getGender());
            data[j][3] = String.valueOf(String.valueOf(csv.childishlist.end.getData().getTotal()));
            data[j][4] = String.valueOf(String.valueOf(csv.childishlist.end.getData().getSubtitled()));
            data[j][5] = String.valueOf(String.valueOf(csv.childishlist.end.getData().getPremier()));
        } else if (genero.equals("Action")) {
            data = new String[csv.actionlist.size][6];
            ptr = csv.actionlist.start;

            while (ptr.getLinkNext() != csv.actionlist.start) {
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

            data[j][0] = String.valueOf(csv.actionlist.end.getData().getCode());
            data[j][1] = String.valueOf(csv.actionlist.end.getData().getTitle());
            data[j][2] = String.valueOf(ptr.getData().getGender());
            data[j][3] = String.valueOf(String.valueOf(csv.actionlist.end.getData().getTotal()));
            data[j][4] = String.valueOf(String.valueOf(csv.actionlist.end.getData().getSubtitled()));
            data[j][5] = String.valueOf(String.valueOf(csv.actionlist.end.getData().getPremier()));
        } else if (genero.equals("Romanctic")) {
            data = new String[csv.romancelist.size][6];
            ptr = csv.romancelist.start;

            while (ptr.getLinkNext() != csv.romancelist.start) {
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

            data[j][0] = String.valueOf(csv.romancelist.end.getData().getCode());
            data[j][1] = String.valueOf(csv.romancelist.end.getData().getTitle());
            data[j][2] = String.valueOf(ptr.getData().getGender());
            data[j][3] = String.valueOf(String.valueOf(csv.romancelist.end.getData().getTotal()));
            data[j][4] = String.valueOf(String.valueOf(csv.romancelist.end.getData().getSubtitled()));
            data[j][5] = String.valueOf(String.valueOf(csv.romancelist.end.getData().getPremier()));
        } else if (genero.equals("Fiction")) {
            data = new String[csv.fictionlist.size][6];
            ptr = csv.fictionlist.start;

            while (ptr.getLinkNext() != csv.fictionlist.start) {
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

            data[j][0] = String.valueOf(csv.fictionlist.end.getData().getCode());
            data[j][1] = String.valueOf(csv.fictionlist.end.getData().getTitle());
            data[j][2] = String.valueOf(ptr.getData().getGender());
            data[j][3] = String.valueOf(String.valueOf(csv.fictionlist.end.getData().getTotal()));
            data[j][4] = String.valueOf(String.valueOf(csv.fictionlist.end.getData().getSubtitled()));
            data[j][5] = String.valueOf(String.valueOf(csv.fictionlist.end.getData().getPremier()));
        } else {
//            JOptionPane.showMessageDialog(rootPane, "No seleccionada");
        }

        this.table = new JTable(data, columnNames);
        this.scrollPane = new JScrollPane(table);

        this.table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        this.scrollPane = new JScrollPane(this.table);
        getContentPane().add(this.scrollPane, BorderLayout.CENTER);

        this.setVisible(false);
        this.setSize(1200, 580);
        this.setLocation(0, 20);
    }
}  // class
