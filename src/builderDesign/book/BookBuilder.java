package builderDesign.book;

public interface BookBuilder {
     public BookBuilder setTitle(String title);
     public BookBuilder setAuthor(String author);
     public BookBuilder setPublicationYear(int y);
     public BookBuilder setPages(int n);
     public Book build();
     
}
