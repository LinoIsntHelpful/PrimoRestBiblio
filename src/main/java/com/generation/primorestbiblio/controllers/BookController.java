package com.generation.primorestbiblio.controllers;

import com.generation.primorestbiblio.model.dao.BookDao;
import com.generation.primorestbiblio.model.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Lui crea un controller per lo scambio di dati
@RestController
public class BookController
{
	@Autowired
	BookDao dao;

	//in REST l'uri è il nome dell'entità su cui lavora il metodo al plurale
	@GetMapping("/books")
	public List<Book> getAll()
	{
		return dao.findAll();
	}
}
