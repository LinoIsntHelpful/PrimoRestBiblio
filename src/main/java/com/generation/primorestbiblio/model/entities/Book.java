package com.generation.primorestbiblio.model.entities;

import com.generation.primorestbiblio.model.entities.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title,author;
	@Enumerated(EnumType.STRING)
	private Genre genre;
}
