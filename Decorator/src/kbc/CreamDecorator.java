package kbc;

public class CreamDecorator extends Decorator {

	public CreamDecorator(Cake cake) {
		super(cake);
	}

	@Override
	public void display() {
		System.out.println("クリームつき");
		cake.display();
	}

}
