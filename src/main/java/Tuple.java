package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramesh on 26/04/2016.
 */
public class Tuple {

    public static void main(String args[]){
        Book b1= new Book("The Hunger Games", 100.0 );
        Book b2= new Book("The Giver", 80.0 );
        Book b3= new Book("Divergent", 125.0 );
        Book b4= new Book("Brave New World", 80.0 );

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(b1);
        listOfBooks.add(b2);
        listOfBooks.add(b3);
        listOfBooks.add(b4);

        //find book with max price
        Book maxBookPrice= b1;

        for (Book b:listOfBooks) {
            if(b.getPrice() > maxBookPrice.getPrice()){
                maxBookPrice = b;
            }

        }

        System.out.println(maxBookPrice);

    }


}

class Book {
    private String name;
    private Double price;
    public Book(String name, Double price) {
        this.name = name;
        this.price = price;

    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}