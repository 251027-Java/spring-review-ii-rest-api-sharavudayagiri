package com.revature.library.controller;

import com.revature.library.model.Book;
import com.revature.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * BookController - REST endpoints for managing books
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        return bookService.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/{id}/checkout")
    public Book checkoutBook(@PathVariable Long id) {
        return bookService.checkoutBook(id);
    }

    @PutMapping("/{id}/return")
    public Book returnBook(@PathVariable Long id) {
        return bookService.returnBook(id);
    }
}
