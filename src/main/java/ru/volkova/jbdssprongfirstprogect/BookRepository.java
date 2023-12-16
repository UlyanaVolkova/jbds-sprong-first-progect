package ru.volkova.jbdssprongfirstprogect;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    List<Book> findBookById(@PathVariable Long id);

}
