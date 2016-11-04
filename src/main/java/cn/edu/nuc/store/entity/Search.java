package cn.edu.nuc.store.entity;

public class Search {
	private String bookName;
	private int start;
	private int offset;
	
	public Search(){}

	public Search(String bookName, int start, int offset) {
		super();
		this.bookName = bookName;
		this.start = start;
		this.offset = offset;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	
	
	
}
