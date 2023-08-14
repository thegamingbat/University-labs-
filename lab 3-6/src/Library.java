import java.util.HashMap;

public class Library {



    HashMap<String , Book> booksMap;
    public Library(){
        this.booksMap = new HashMap<>();
    }
    public void booksMap(Book b){
        booksMap.put(b.getTitle(),b);
    }
    public void addBook(Book b){
        booksMap.put(b.getTitle(),b);
    }

    public void removeBook(String title){
        Book obj = booksMap.get(title);
        if(obj != null)
            booksMap.remove(obj);


    }

    public void displayBooks(){
        for (Book b:booksMap.values()
             ) {
            System.out.println(b);
            System.out.println("-------------");

        }
    }


    
}
