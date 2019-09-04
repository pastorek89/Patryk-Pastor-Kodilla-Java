package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBook() {
        //Given
        Library library = new Library("Wrzosowo Center Library");
        Book book1 = new Book("Pan Tadeusz", "Adam Mickiewicz", LocalDate.of(1884, 1, 1));
        Book book2 = new Book("Nad Niemnem", "Eliza Orzeszkowa", LocalDate.of(1887, 3, 30));
        Book book3 = new Book("Hobbit", "Tolkien", LocalDate.of(1937, 9, 21));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library of Wisdom(Shallow)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Rolling In The Deep Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //When
        //Then
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertEquals(library.getBooks(), deepClonedLibrary.getBooks());
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());


    }
}
