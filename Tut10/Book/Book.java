package Tut10.Book;

/**
 *
 * @author Cuon7
 */
public class Book {
    private String author;
    private String title;    
    private double price;

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() <3) {
            throw new IllegalArgumentException("Title is not valid");
        }
        this.title = title;
    }

    protected double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<1) {
            throw new IllegalArgumentException("Price is not valid");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }

    
}
