package dev.santosh.bookapiservices;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;
    private final BookRepository bookRepository;

    public BookController(BookService bookService, BookRepository bookRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {

        return bookService.addBook(book);
    }


    // get book by id

    @GetMapping("/{id}")
    public Book getBookById(long id) {

        return bookService.getBookById(id);

    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }


    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,
                           @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }




}
