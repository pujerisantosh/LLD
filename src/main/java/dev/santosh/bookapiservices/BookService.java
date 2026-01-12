package dev.santosh.bookapiservices;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }


    public Book addBook(Book book) {

        return bookRepository.save(book);

    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    public Book updateBook(long id , Book book){
        Book existingBook = bookRepository.findById(id);
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setIsbn(book.getIsbn());
        existingBook.setPrice(book.getPrice());
        existingBook.setQuantity(book.getQuantity());
        return bookRepository.save(existingBook);



    }


}
