package polymorphism;

public class Test0 {
	public void serach(int numb) {
		System.out.println(numb);
	}
	
public void serach(String name) {
		System.out.println(name);
	}

public void serach(int numb,String name) {
	System.out.println(numb+name);
}

public static void main(String[] args) {
	Test0 t=new Test0();
	t.serach("John");
	t.serach(7666767);
}

}
