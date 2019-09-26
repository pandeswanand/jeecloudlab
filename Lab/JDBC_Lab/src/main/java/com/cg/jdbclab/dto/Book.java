package com.cg.jdbclab.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Book
{
    private BigInteger bookId;
    private String bookName;
    private Double bookPrice;
    private BigInteger authorId;
    
    public Book() {
    }
    
    
    
    @Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorId="
				+ authorId + "]";
	}



	public Book(BigInteger bookId, String bookName, Double bookPrice, BigInteger authorId) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorId = authorId;
	}



	public BigInteger getBookId() {
		return bookId;
	}



	public void setBookId(BigInteger bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public Double getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}



	public BigInteger getAuthorId() {
		return authorId;
	}



	public void setAuthorId(BigInteger authorId) {
		this.authorId = authorId;
	}



	@Override
    public int hashCode() {
        return this.bookId.intValue();
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
