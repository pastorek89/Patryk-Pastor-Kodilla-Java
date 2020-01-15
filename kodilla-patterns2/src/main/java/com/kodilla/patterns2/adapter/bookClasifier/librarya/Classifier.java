package com.kodilla.patterns2.adapter.bookClasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
