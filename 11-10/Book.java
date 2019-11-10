public class Book{
	private String title;
	private String author;
	private double price;
	private String publisher;
	Book(String title,String author,double price,String publisher){
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
	}
	String getTitle(){
		return title;
	}
	String getAuthor(){
		return author;
	}
	double getPrice(){
		return price;
	}
	String publisher(){
		return publisher;
	}
	void setTitle(String title){
		this.title=title;
	}
	void appendAuthor(String author){
		this.author=this.author+" "+author;
	}
	double priceDiscount(double discount){
		return this.price*=discount;
	}
public String toString(){
	return String.format("%s-by-%s-%f-%s",title,author,price,publisher);
}
public static void main(String[] args){
	Book book1=new Book("呐喊","鲁迅",50.0,"人民出版社");
	System.out.println(book1);
	book1.priceDiscount(0.8);
	System.out.println(book1);
}
}