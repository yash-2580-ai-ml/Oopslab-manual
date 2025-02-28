public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public void displayDetails() {
        System.out.println("The title of the book is: " + title);
        System.out.println("The author of the book is: " + author);
        System.out.println("The book is published in the year: " + yearOfPublication);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Something Wicked This Way Comes", "Ray Bradbury", 1962);
        b1.displayDetails();
    }
}



