package com.generation.primorestbiblio.model.dao;

import com.generation.primorestbiblio.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Long>
{
}
