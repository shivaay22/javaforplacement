class library
{
    String[] books;
    int no_of_books;
    library()
    {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been addedd");
    }
    void showAvailableBook()
    {
        System.out.println("Available Books are: ");
        for(String book: this.books)
        {
            if(book == null)
            {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issuedbook(String book)
    {
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exixst");
    }
}

public class librarry {
    public static void main(String[] args) {
        library cb = new library();
        cb.addBook("Algorithm");
        cb.addBook("c++");
        cb.showAvailableBook();
        cb.issuedbook("c++");
        cb.showAvailableBook();
    }
}
