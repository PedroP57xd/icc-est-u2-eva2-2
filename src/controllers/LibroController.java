package controllers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import models.Book;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> libros) {
       return libros.stream()
                .collect(Collectors.toMap(
                        book -> book,
                        book -> book,
                        (existing, replacement) -> existing)); // Manejo de duplicados
    }
}
