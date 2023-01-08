package excercise2_2;

import java.util.Arrays;

public class Book {
    private Author[] authors;
    private String name;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames(){
        String str = "";
        for (int i = 0; i < authors.length; i++){
            if (i < authors.length - 1) {
                str += authors[i].getName() + ",";
            }
            else {
                str += authors[i].getName();
            }
        }
        return '"' + str + '"';
    }

    @Override
    public String toString() {
        return "Book[" + "name='" + name + '\'' + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + ']';
    }
}

