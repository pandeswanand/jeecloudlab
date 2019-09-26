package com.cg.jdbclab.ui;


import com.cg.jdbclab.Exception.UserException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.cg.jdbclab.dto.Author;
import com.cg.jdbclab.dto.Book;

import java.util.List;
import java.util.Scanner;
import com.cg.jdbclab.dao.DaoImpl;
import com.cg.jdbclab.dao.Dao;

public class Application
{
    private static Dao dao;
    
    static {
        dao = new DaoImpl();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1 to add book");
            System.out.println("2 to add author");
            System.out.println("3 to list all books");
            System.out.println("4 to list all books of a specific author"); 
            System.out.println("5 to exit");
            choice = scanner.nextInt();
            switch(choice) {
            case 1:	
            	System.out.println("Enter the book name");
            	String book_name = scanner.next();
            	System.out.println("Enter the book price");
            	double book_cost = scanner.nextDouble();
            	System.out.println("Enter the author id");
            	BigInteger aid = scanner.nextBigInteger();
            	Book book = new Book();
            	book.setBookName(book_name);
            	book.setBookPrice(book_cost);
            	book.setAuthorId(aid);
            	//System.out.println(book.getBookName());
            	try {
					dao.addBook(book);
				} catch (UserException e) {
					System.out.println(e.getMessage());
				}
            	break;
            case 2: 
            	System.out.println("Enter the author first name");
            	String fname = scanner.next();
            	System.out.println("Enter the author middle name");
            	String mname = scanner.next();
            	System.out.println("Enter the author last name");
            	String lname = scanner.next();
            	System.out.println("Enter the author phone number");
            	long number = scanner.nextLong();
            	Author author = new Author();
            	author.setFirstName(fname);
            	author.setMiddleName(mname);
            	author.setLastName(lname);
            	author.setPhoneNo(number);
            	
            	try {
					dao.addAuthor(author);
				} catch (UserException e) {
					System.out.println(e.getMessage());
				}
            	break;
            case 3:	
            	List<Book> bookList = dao.listAllBooks();
            	bookList.forEach(item->{
            		System.out.println(item.getBookName());
            	});
            	break;
            case 4: 
            	System.out.println("Enter author Id whose books are to be found");
            	BigInteger id = scanner.nextBigInteger();
            	Book book1 = new Book();
            	book1.setAuthorId(id);
            	List<Book> list = dao.authorBooks(book1);
            	list.forEach(item->{
            		System.out.println(item.getBookName());
            	});
            	break;
            case 5: System.exit(0);
            default:	
            	System.out.println("Enter choice between 1 and 5 only!");
            	break;
            }
        } while (choice != 5);

    }
}
