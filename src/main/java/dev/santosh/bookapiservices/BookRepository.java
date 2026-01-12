package dev.santosh.bookapiservices;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepository {

    private final Map<Long, Book> store = new HashMap<>();

    public Book save(Book book) {
        store.put(book.getId(), book);

        return book;

    }


    public Book findById(Long id) {
        return store.get(id);
    }

    public List<Book> findAll(){
        return new ArrayList<>(store.values());
    }



}
