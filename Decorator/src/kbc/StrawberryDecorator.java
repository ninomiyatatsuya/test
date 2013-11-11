package kbc;

public class StrawberryDecorator extends Decorator{

	public StrawberryDecorator(Cake cake) {
		super(cake);

	}

	@Override
	public void display() {
		System.out.println("苺つき");
		cake.display();
	}

}
