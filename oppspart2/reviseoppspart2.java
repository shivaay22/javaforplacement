class librarry{
    String[] books;
    int no_of_books;
    librarry()
    {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    public void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "Has been added successfully");
    }
    public void showAvailableBook()
    {
        System.out.println("Available books are");
        for(String books:this.books)
        {
            if(books == null)
            {
                continue;
            }
            System.out.println("*" + books);
        }
    }
    public void issuedbook()
    {
        for(int i=0;i<books.length;i++)
        {
            if(this.books[i].equals(books))
            {
                System.out.println("Books has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book doesnot exist");
    }
}
public class reviseoppspart2 {
    public static void main(String[] args) {
        
    }
}
