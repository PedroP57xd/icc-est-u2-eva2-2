package controllers;

import models.Book;
import java.util.*;
import java.util.stream.Collectors;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Comparator<Book> bookComparator = Comparator
                .comparing(Book::getTitulo, Comparator.reverseOrder())  // Título descendente
                .thenComparingInt(Book::getAnio);                       // Año ascendente

        return libros.stream()
                .distinct() // elimina duplicados según equals() y hashCode()
                .sorted(bookComparator)
                .collect(Collectors.toMap(
                        book -> book,
                        book -> book,
                        (existing, replacement) -> existing, // en caso de colisión, mantener el primero
                        LinkedHashMap::new                   // mantener orden de inserción
                ));
    }
}
