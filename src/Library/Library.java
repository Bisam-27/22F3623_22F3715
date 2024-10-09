package Library;

import java.util.ArrayList;
import java.util.List;

public class Library
{
    private List<String> books = new ArrayList<>();

    public void addBook(String bookName) 
    {
        books.add(bookName);
        System.out.println(bookName + " added to library.");
    }

    public void listBooks()
    {
        System.out.println("Books in library: " + books);
    }
    
    public boolean searchBook(String bookName)
    {
    	return books.contains(bookName);
    }

   public void removeBook(String bookName) 
   {
     if (books.remove(bookName)) 
   {
       System.out.println(bookName + &quot; removed from library.&quot;);
    } 
     else 
     {
       System.out.println(bookName + &quot; not found in library.&quot;);
      }
    }
    public static void main(String[] args)
    {
        Library myLibrary = new Library();
        myLibrary.addBook("Harry Potter");
        myLibrary.addBook("Lord of the Rings");
        myLibrary.listBooks();
    }
}


