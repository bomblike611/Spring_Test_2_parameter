package com.iu.book;

import java.util.List;

import javax.inject.Inject;

public class BookService {
	
	
	private BookDAO bookDAO;
	
	//constructor
	public BookService() {
		// TODO Auto-generated constructor stub
	}
	
	//setter
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	public List<BookDTO> selectList()throws Exception{
		return bookDAO.selectList();
	}
	
	public int insert(BookDTO bookDTO)throws Exception{
		return bookDAO.insert(bookDTO);
	}
	
	
	
	
}
