package ca.sheridancollege.controllers;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.beans.Book;

@Controller
public class HomeController {

	private CopyOnWriteArrayList<Book> bookList = new CopyOnWriteArrayList<Book>();
	
	@GetMapping("/")	
	public String goHome(Model model) {
		model.addAttribute("bookList", bookList);
		
		return "index";
	}
	
	@GetMapping("/addPage")
	public String goAddBook(Model model) {
		model.addAttribute("book", new Book());
		
		return "add_book";
	}
	
	@PostMapping("/addBook")
	public String actionAddBook(Model model, @ModelAttribute Book book) {
		
		bookList.add(book);
		
		return "redirect:/";
	}
	
}
