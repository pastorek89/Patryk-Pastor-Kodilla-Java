package com.kodilla.patterns2.adapter.bookClasifier;

import com.kodilla.patterns2.adapter.bookClasifier.librarya.Book;
import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        MedianAdapter adapter = new MedianAdapter();

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Franek Dolas", "Do siego roku", 1989, "JDHEURK23"));
        bookSet.add(new Book("Maria Wach", "Pani Wołodyjowska", 1995, "ASDAFE432"));
        bookSet.add(new Book("Mathias Mueller", "Einz,zwei,drei", 1934, "GDHTEWF45"));
        bookSet.add(new Book("Test Testowicz", "Testy", 1978, "BWWREETHT67"));
        bookSet.add(new Book("Mariusz Półlitra", "Abstynent", 1812, "JFDGAG3"));
        bookSet.add(new Book("Pieseł", "Jak zostałam Piesełem", 1709, "HGJTYTJ3"));
        bookSet.add(new Book("Nieznany", "W pogoni za nieznajomą", 1243, "JIUYTRH3"));
        //When
        int result = adapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(1934,result);
    }
}
