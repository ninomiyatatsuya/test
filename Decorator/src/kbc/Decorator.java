package kbc;

public abstract class Decorator implements Cake{

	protected Cake cake;

	public Decorator(Cake cake) {
		this.cake = cake;
	}
}
