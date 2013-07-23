package edu.neumont;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 22/07/13
 * Time: 18:01
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class Library {

    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
