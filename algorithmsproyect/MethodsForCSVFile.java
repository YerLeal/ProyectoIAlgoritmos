package algorithmsproyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MethodsForCSVFile {

    static LinkedList dramalist = new LinkedList();
    static LinkedList comedylist = new LinkedList();
    static LinkedList childishlist = new LinkedList();
    static LinkedList actionlist = new LinkedList();
    static LinkedList romancelist = new LinkedList();
    static LinkedList fictionlist = new LinkedList();
    static LinkedList totallist = new LinkedList();
    
    private String path;
    
    public MethodsForCSVFile(String path){
        this.path = path;
    }

    public void readCSVFile() {
        BufferedReader br;
        String line;

        try {
            br = new BufferedReader(new FileReader(this.path));

            while ((line = br.readLine()) != null) {

                String[] movieArray = line.split(",");

                if (!movieArray[0].equals("code")) {

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

    public void searchMovie(String name) {
        BufferedReader br;
        String line;

        try {

            br = new BufferedReader(new FileReader(this.path));

            while ((line = br.readLine()) != null) {

                String[] movieArray = line.split(",");

                if (movieArray[1].equals(name.trim())) {
                    Movie movie = new Movie(Integer.parseInt(movieArray[0]), movieArray[1], movieArray[2], Integer.parseInt(movieArray[3]), Integer.parseInt(movieArray[4]), Integer.parseInt(movieArray[5]));
                    System.out.println(movie.toString());
                    //break;
                }//if
            }//while    
            //System.err.println("Movie not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // searchMovie
    
    public void inserMovieIntoFile(Movie movie){
        BufferedWriter bw;
        
        try{
            bw = new BufferedWriter(new FileWriter(this.path, true));
        }catch(IOException e){
            e.printStackTrace();
        } // catch   
    } // inserMovieIntoFile

}//class
