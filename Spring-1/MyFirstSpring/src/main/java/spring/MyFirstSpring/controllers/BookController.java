package spring.MyFirstSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.MyFirstSpring.repositories.BookRepository;

@Controller // working with MVC
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){// retuning to view

        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
