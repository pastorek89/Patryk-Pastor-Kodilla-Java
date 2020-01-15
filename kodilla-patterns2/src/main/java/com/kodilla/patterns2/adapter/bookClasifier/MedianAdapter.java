package com.kodilla.patterns2.adapter.bookClasifier;

import com.kodilla.patterns2.adapter.bookClasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookClasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookClasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookClasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, BookB> books = new HashMap<>();
        for (Book book : bookSet) {
            books.put(new BookSignature(book.getSignature()),
                    new BookB(book.getAuthor(),book.getTitle(),book.getPublicationYear()));
            }
        return medianPublicationYear(books);
    }
}
