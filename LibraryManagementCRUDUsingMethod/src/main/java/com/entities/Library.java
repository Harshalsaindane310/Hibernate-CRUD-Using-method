package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "store")
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int BookNo;
	String BookName;
	String Author;
	String Category;
	
	public Library() {
		
	}

	public int getBookNo() {
		return BookNo;
	}

	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Library(int bookNo, String bookName, String author, String category) {
		super();
		BookNo = bookNo;
		BookName = bookName;
		Author = author;
		Category = category;
	}

	@Override
	public String toString() {
		return "library [BookNo=" + BookNo + ", BookName=" + BookName + ", Author=" + Author + ", Category=" + Category
				+ "]";
	}
	
	
	
	
	
	
	
	

}
