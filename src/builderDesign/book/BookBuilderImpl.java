package builderDesign.book;

public class BookBuilderImpl implements BookBuilder{
//    private Book book;
//    
//    public BookBuilderImpl() {
//    	this.book = new Book();
//    }
//    
	        String title;  // required
	        String Author;  // required
	        int publicationYear = 0;  // optional
	        int pages = 0;  // optional
	
 
	@Override
	public BookBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	@Override
	public BookBuilder setAuthor(String author) {
		this.Author = author;
		return this;
	}

	@Override
	public BookBuilder setPublicationYear(int y) {
	    this.publicationYear = y;
		return this;
	}

	@Override
	public BookBuilder setPages(int n) {
	    this.pages = n;
		return this;
	}

	@Override
	public Book build() {		
		return new Book(this);
	}
       
	
}
