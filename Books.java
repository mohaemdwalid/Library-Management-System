import java.util.Scanner;


public class Books {

        //  rent book
        // blocking user who rent books late 
        Book []books = new Book[50];
        public static int count;

        Scanner input = new Scanner(System.in);

        // Method 1
        //  To compare books
        public void compareBookObjects(Book b1, Book b2){
                if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
                    System.out.println("Book of this Name Already Exists.");
                }
        }

        // Method 2
        // To add book
        public void addBook(Book b){
        if (count < 50) {
 
            books[count] = b;
            count++;
        }
        else {
 
            System.out.println(
                "No Space to Add More Books.");
        }
        }
        // Method 3
        // To search book by name
        public void searchByBookName(){
            System.out.println("\t\t\t\tSEARCH BY Book'S NAME");
            input.nextLine();

            System.out.println("Enter Book Name:");
            String BookN = input.nextLine();
            System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

            int flag = 0;

            for (int i = 0; i < count; i++) {
                if (BookN.equalsIgnoreCase(books[i].bookName)) {
                    System.out.println(
                        books[i].bookName + "\t\t"
                        + books[i].authorName + "\t\t"
                        + books[i].bookQty + "\t\t"
                        + books[i].bookQtyCopy);
                    flag ++;
                }
            }
            if (flag == 0) {
                System.out.println("No Books of " + BookN+ " Found.");
            }
 
        }
        // Method 4
        // To display all books
        public void showAllBooks(){
            System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
            System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

            for (int i = 0; i < count; i++) {
                System.out.println(
                    books[i].bookName + "\t\t"
                    + books[i].authorName + "\t\t"
                    + books[i].bookQty + "\t\t"
                    + books[i].bookQtyCopy);
            }
 
        }




     

}
