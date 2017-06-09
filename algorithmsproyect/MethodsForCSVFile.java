package algorithmsproyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class MethodsForCSVFile {

    public LinkedList dramalist = new LinkedList();
    public LinkedList comedylist = new LinkedList();
    public LinkedList childishlist = new LinkedList();
    public LinkedList actionlist = new LinkedList();
    public LinkedList romancelist = new LinkedList();
    public LinkedList fictionlist = new LinkedList();
    public LinkedList totallist = new LinkedList();
    
    private String path;
    
    LinkedList list = new LinkedList();
    
    public MethodsForCSVFile(String path){
        this.path = "/File/datos.csv";
    }

    public void readCSVFile() {
        BufferedReader br;
        String line;

        try {
            br = new BufferedReader(new FileReader(this.path));

            while ((line = br.readLine()) != null) {

                String[] movieArray = line.split(",");

                if (!movieArray[0].equals("code") && !line.equals("")) {

                    Movie movie = new Movie(Integer.parseInt(movieArray[0]), movieArray[1], movieArray[2], Integer.parseInt(movieArray[3]), Integer.parseInt(movieArray[4]), Integer.parseInt(movieArray[5]));

                    if (movieArray[2].equals("1000")) {
                        dramalist.insertAtStart(movie);
                    }
                    if (movieArray[2].equals("2000")) {
                        comedylist.insertAtStart(movie);
                    }
                    if (movieArray[2].equals("3000")) {
                        childishlist.insertAtStart(movie);
                    }
                    if (movieArray[2].equals("4000")) {
                        actionlist.insertAtStart(movie);
                    }
                    if (movieArray[2].equals("5000")) {
                        romancelist.insertAtStart(movie);
                    }
                    if (movieArray[2].equals("6000")) {
                        fictionlist.insertAtStart(movie);
                    }
                    totallist.insertAtStart(movie);
                }
            }//while

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }//catch    
    } // readCSVFile

    public String searchMovie(String name) {
        BufferedReader br;
        String line;
        try {
            br = new BufferedReader(new FileReader(this.path));
            while ((line = br.readLine()) != null) {
                String[] movieArray = line.split(",");
                if (movieArray[1].equals(name.trim())) {
                    Movie movie = new Movie(Integer.parseInt(movieArray[0]),
                            movieArray[1], movieArray[2], Integer.parseInt(movieArray[3]),
                            Integer.parseInt(movieArray[4]), Integer.parseInt(movieArray[5]));     
                    return line;
                }//if
            }//while    
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return "";
    } // searchMovie
    
    public void inserMovieIntoFile(Movie movie, int code){
        BufferedWriter bw;
        BufferedReader br;
        boolean flag = false;
        
        try{
            bw = new BufferedWriter(new FileWriter(this.path, true));
            br = new BufferedReader(new FileReader(this.path));
            
            String line;
            
            while((line = br.readLine()) != null){
                String [] array = line.split(",");
                if(array[0].equals(String.valueOf(code)));
                    flag = true;
            }//while
            
            if(flag == false){
                bw.write(String.valueOf(movie.getCode())+","+movie.getTitle()+","+movie.getGender()+","+String.valueOf(movie.getTotal())+","+String.valueOf(movie.getSubtitled())+","+String.valueOf(movie.getPremier()));
                bw.newLine();
                list.insertAtStart(movie);
                
                if(movie.getCode() == 1000)
                    dramalist.insertAtStart(movie);
                if(movie.getCode() == 2000)
                    comedylist.insertAtStart(movie);
                if(movie.getCode() == 3000)
                    childishlist.insertAtStart(movie);
                if(movie.getCode() == 4000)
                    actionlist.insertAtStart(movie);
                if(movie.getCode() == 5000)
                    romancelist.insertAtStart(movie);
                if(movie.getCode() == 6000)
                    fictionlist.insertAtStart(movie);
                
                bw.close();
                JOptionPane.showMessageDialog(null, "Saved");
            }else
                JOptionPane.showMessageDialog(null, "This movie already exists", "Error", 0);
        }catch(IOException e){
            e.printStackTrace();
        } // catch   
    } // inserMovieIntoFile

} // class
