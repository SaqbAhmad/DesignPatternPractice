package builderDesign.book;

public class Book {
	String title;  // required
	String Author;  // required
	int publicationYear;  // optional
	int pages;  // optional
	
	
	
	public Book(BookBuilderImpl bookBuilderImpl) {
		this.Author = bookBuilderImpl.Author;
		this.title = bookBuilderImpl.title;
		this.pages = bookBuilderImpl.pages;
		this.publicationYear = bookBuilderImpl.publicationYear;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", Author=" + Author + ", publicationYear=" + publicationYear + ", pages="
				+ pages + "]";
	}
	
	
}
