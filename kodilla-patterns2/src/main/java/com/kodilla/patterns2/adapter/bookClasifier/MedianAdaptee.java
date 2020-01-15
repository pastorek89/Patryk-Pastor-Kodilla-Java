package com.kodilla.patterns2.adapter.bookClasifier;

import com.kodilla.patterns2.adapter.bookClasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookClasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookClasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookClasifier.libraryb.Statistics;
import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        return statistics.medianPublicationYear(books);
    }
}
