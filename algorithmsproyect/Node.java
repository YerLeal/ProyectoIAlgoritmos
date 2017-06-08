package algorithmsproyect;

public class Node {
    
    protected Node prev;
    protected Node next;
    protected Movie movie;
    
    public Node(){
        this.next = null;
        this.prev = null;
        this.movie.setCode(0);
        this.movie.setGender("");
        this.movie.setPremier(0);
        this.movie.setSubtitled(0);
        this.movie.setTitle("");
        this.movie.setTotal(0);
    }//Constructor
    
    public Node(Movie movie, Node n, Node p){
        this.movie = movie;
        this.next = n;
        this.prev = p;
    }//overload constructor 
    
    public void setLinkNext(Node n){
        this.next = n;
    }//setLinkNext
    
    public void setLinkPrev(Node p){
        prev = p;
    }//setLinkPrev
    
    public Node getLinkNext(){
        return this.next;
    }//getLinkNext
    
    public Node getLinkPrev(){
        return this.prev;
    }//getLinkPrev
    
    public void setData(Movie movie){
        this.movie = movie;
    }//setData
    
    public Movie getData(){
        return this.movie;
    }//getData
    
}//class
