package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("a1", "t1", 1600, "s1");
        Book book2 = new Book("a2", "t2", 1935, "s2");
        Book book3 = new Book("a3", "t3", 2000, "s3");
        Book book4 = new Book("a4", "t4", 1974, "s4");
        Book book5 = new Book("a5", "t5", 1924, "s5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(publicationYearMedian, 1935, 0);
    }
}
