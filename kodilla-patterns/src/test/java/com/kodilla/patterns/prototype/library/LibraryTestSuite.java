package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Library1");
        Book book1 = new Book("book1", "author1", LocalDate.of(2011, 1, 11));
        Book book2 = new Book("book2", "author2", LocalDate.of(2012, 2, 12));
        Book book3 = new Book("book3", "author3", LocalDate.of(2013, 3, 13));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Library1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned Library1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}