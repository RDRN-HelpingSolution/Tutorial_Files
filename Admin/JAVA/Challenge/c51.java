package Challenge;

class Library{
    String title;
    String author;
    String isbn;
    static int totalBooks=0;
    boolean purchased;

    Library(String title ,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        totalBooks++;
    } 

    public static int getTotalbooks(){
        return totalBooks;
    }
    
    void borrowBook(){
        if (purchased) {
            System.out.println("not available");
        } else {
            this.purchased=true;
            totalBooks--;
            System.out.println("Enjoy : "+this.title);
        }
         
    }
    void returnBook(){
        if (purchased) {
            this.purchased=false;
             totalBooks++;
             System.out.println("Thanks Come Again ! ");
             System.out.println("Provide Review for : "+this.title);
        } else {
            System.out.println("Already in library");
        }
         
    }
}
public class c51 {
    public static void main(String[] args) {
            System.out.println();
            System.out.println("Welcome to RDRN Library");
            System.out.println();
            Library mLibrary=new Library("java", "Roushan", "a101");
            Library mLibrary1=new Library("html", "neha", "a102");
            Library mLibrary2=new Library("css", "Rounit", "a103");
            Library mLibrary3=new Library("js", "Ravi", "a104");
            System.out.println("Total book in opening = "+Library.getTotalbooks());
            System.out.println();

            mLibrary.borrowBook();
            System.out.println();

            mLibrary.borrowBook();
            System.out.println();

            mLibrary.returnBook();
            System.out.println();

            mLibrary.returnBook();
            System.out.println();

            mLibrary.borrowBook();
            System.out.println();

            System.out.println("Total book left = "+Library.getTotalbooks());
            System.out.println();
        }
    }
    
