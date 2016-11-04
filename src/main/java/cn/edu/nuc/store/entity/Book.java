package cn.edu.nuc.store.entity;

import java.io.Serializable;

public class Book implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer bookid;

    private String bookname;

    private String bookauthor;

    private Integer typeid;
    
    private BookType bookType;

    private String typename;

    private String bookimg;

    private Double bookprice;

    private Integer bookhot;

    private String booksimple;

    private String bookcomplex;

    private Double bookdouban;

    private Integer booknumber;

    private String booktime;

    private Integer bookcommentsnumber;
    
   /* private Integer add;   //自己故意添加，用来学习！

    
    
    public Integer getAdd() {
		return add;
	}

	public void setAdd(Integer add) {
		this.add = add;
	}*/

	public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor == null ? null : bookauthor.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
    
    

    public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getBookimg() {
        return bookimg;
    }

    public void setBookimg(String bookimg) {
        this.bookimg = bookimg == null ? null : bookimg.trim();
    }

    public Double getBookprice() {
        return bookprice;
    }

    public void setBookprice(Double bookprice) {
        this.bookprice = bookprice;
    }

    public Integer getBookhot() {
        return bookhot;
    }

    public void setBookhot(Integer bookhot) {
        this.bookhot = bookhot;
    }

    public String getBooksimple() {
        return booksimple;
    }

    public void setBooksimple(String booksimple) {
        this.booksimple = booksimple == null ? null : booksimple.trim();
    }

    public String getBookcomplex() {
        return bookcomplex;
    }

    public void setBookcomplex(String bookcomplex) {
        this.bookcomplex = bookcomplex == null ? null : bookcomplex.trim();
    }

    public Double getBookdouban() {
        return bookdouban;
    }

    public void setBookdouban(Double bookdouban) {
        this.bookdouban = bookdouban;
    }

    public Integer getBooknumber() {
        return booknumber;
    }

    public void setBooknumber(Integer booknumber) {
        this.booknumber = booknumber;
    }

    public String getBooktime() {
        return booktime;
    }

    public void setBooktime(String booktime) {
        this.booktime = booktime == null ? null : booktime.trim();
    }

    public Integer getBookcommentsnumber() {
        return bookcommentsnumber;
    }

    public void setBookcommentsnumber(Integer bookcommentsnumber) {
        this.bookcommentsnumber = bookcommentsnumber;
    }

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", typeid=" + typeid
				+ ", bookType=" + bookType + ", typename=" + typename + ", bookimg=" + bookimg + ", bookprice="
				+ bookprice + ", bookhot=" + bookhot + ", booksimple=" + booksimple + ", bookcomplex=" + bookcomplex
				+ ", bookdouban=" + bookdouban + ", booknumber=" + booknumber + ", booktime=" + booktime
				+ ", bookcommentsnumber=" + bookcommentsnumber + "]";
	}
    
}