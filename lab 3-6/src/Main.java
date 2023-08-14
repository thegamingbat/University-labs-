import java.util.*;

public class Main {
    public static void main(String[] args){
        var b1 = new Book();
        var b2 = new Book();
        var b3 = new Book("Christmas Carol","Charles Dickens",50 , 11);
        var b4 = new Book("Oliver Twist" , "Charles Dickens" , 50 , 2);


        b2.setAuthor("Eichiro Oda");
        b2.setTitle("One Piece");
        b2.setPrice(100);
        b2.setQuantity(1);

        b1.setAuthor("Charles Dickens");
        b1.setTitle("The Great Expectation");
        b1.setPrice(50);
        b1.setQuantity(10);
        ArrayList<Book> A1 = new ArrayList<Book>();

        A1.add(b1);
        A1.add(b2);
        A1.add(b3);
        A1.add(b4);
        for (Book b:A1
        ) {
            b.display();
            System.out.println("------------------------");

        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        var LibraryApp = new Library();


        LibraryApp.addBook(b1);
        LibraryApp.addBook(b2);
        LibraryApp.addBook(b3);
        LibraryApp.addBook(b4);
        LibraryApp.displayBooks();
        LibraryApp.removeBook("One Piece");
        LibraryApp.displayBooks();

        HashSet<String> set=new HashSet<>();
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Iterator<Book> e= A1.iterator();

        while(e.hasNext())
        {
            set.add(e.next().getAuthor());
        }

        System.out.println(set);
















    }

}
