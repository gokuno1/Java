package puzzles.practice.hackerrank.java;

public class MyBook extends Book{

	private int price;
    
    public MyBook(String title, String author, int price){
        super(title, author);
        this.price=price;
    }
    
    void display()
    {
        System.out.println(
            "Title: " + title 
        +     "\nAuthor: " + author
        +     "\nPrice: "+ price        ); 
    }
}
