package algorithmsproyect;

public class LinkedList {

    protected Node start;
    protected Node end;
    public int size;

    public LinkedList() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public void insertAtStart(Movie movie) {
        Node newPtr = new Node(movie, null, null);

        if (start == null) {
            newPtr.setLinkNext(newPtr);
            newPtr.setLinkPrev(newPtr);
            start = newPtr;
            end = newPtr;
        } else {
            newPtr.setLinkPrev(end);
            end.setLinkNext(newPtr);
            start.setLinkPrev(newPtr);
            newPtr.setLinkNext(start);
            start = newPtr;
        }//else
        this.size++;
    } // insertAtStart

    public void display() {
        System.out.print("\nCircular Doubly Linked List = ");
        Node ptr = start;
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == start) {
            System.out.print(start.getData() + " <-> " + ptr.getData() + "\n");
            return;
        }
        System.out.print(start.getData() + " <-> ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != start) {
            System.out.print(ptr.getData() + " <-> ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData() + " <-> ");
        //ptr = ptr.getLinkNext();
        //System.out.print(ptr.getData()+ "\n");
    } // display

} // class
