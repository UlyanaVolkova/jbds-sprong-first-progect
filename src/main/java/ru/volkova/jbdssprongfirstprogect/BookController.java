package ru.volkova.jbdssprongfirstprogect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks(){
        return bookRepository.findAllBooks();
    }
    @GetMapping("/book/{id}")
    public List<Book> getBookById(@PathVariable Long id){
        return bookRepository.findBookById(id);
    }

}
