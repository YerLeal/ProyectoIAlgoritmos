package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowList extends JInternalFrame{
    
    private JTable table;
    private JScrollPane scrollPane;
    
    public WindowList(){
        super("Window List", false, true, false);
                this.setLayout(new BorderLayout());
        
        String[] columnNames = {"Code","Title","Gender","Total","Subtitled","Premier"};
        Object [][] data = {{"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Code","Title","Gender","Total","Subtitled","Premier"},
        {"Codeul","Titleul","Gender","Total","Subtitled","Premier"}};
        
        this.table = new JTable(data,columnNames);
        this.scrollPane = new JScrollPane(table);

        this.table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        this.scrollPane = new JScrollPane(this.table);
        getContentPane().add(this.scrollPane, BorderLayout.CENTER);
        
        this.setVisible(false);
        this.setSize(500, 400);
        this.setLocation(10, 30);
    }
}  // class
