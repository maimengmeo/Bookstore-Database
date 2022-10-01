package ca.sheridancollege.beans;

import lombok.Data;

@Data
public class Book {
	private Long isbn;
	private String title;
	private String author;
	private Double price;
	private Integer quantity;
	
	private String category;
	private final String [] categories = {"Fiction", "Non-Fiction", "Self-helf", "History"};
}
