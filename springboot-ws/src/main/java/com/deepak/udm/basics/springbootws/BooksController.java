package com.deepak.udm.basics.springbootws;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(new Book(1L, "Deepak Singh", "The most useful book"));
	}
}
