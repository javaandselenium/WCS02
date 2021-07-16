package polymorphism;

public class Myntra  extends Ecommerce{
	public void shop() {
		System.out.println("shopping from myntra");
	}
	
	public static void main(String[] args) {
		Ecommerce e=new Flipkart();
		e.shop();
	}

}
