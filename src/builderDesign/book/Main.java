package builderDesign.book;

public class Main {

	public static void main(String[] args) {
          
		BookBuilder bookBuilder = new BookBuilderImpl();
		
//		Book rahulBook = bookBuilder.setAuthor("Rahul")
//		           .setPages(50)
//		           .setPublicationYear(25)
//		           .setTitle("Basic of programming")
//		           .build();
//		System.out.println("Rahul book details is : " +rahulBook);
//		
//		Book javaBook = bookBuilder.setAuthor("Ranga")
//				                   .setPages(30)
//				                   .setPublicationYear(2019)
//				                   .setTitle("Intro to java programming")
//				                   .build();
//		
//		System.out.println("The book of java is : " +javaBook);
//		
//		
//		Book cppBook = bookBuilder.setAuthor("Saquib")
//				                  .setPages(15)
//				                  .setTitle("Cpp programming book.")
//				                  .build();
//		
//		System.out.println("The book of c++ is : " +cppBook);
		
		Book maths = bookBuilder.setAuthor("Amit Mohan")
				                .setTitle("Advance Mathematics ")
				                .setPages(15)
				                .build();
		
		System.out.println("The mathematics book : " +maths);
		
		
	
		                      
		
	}

}
