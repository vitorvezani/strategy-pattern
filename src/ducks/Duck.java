package ducks;
import quack.QuackBehavior;
import fly.FlyBehavior;


public abstract class Duck {

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void swin() {
		System.out.println("Estou nadando!!");
	}
	
	public void walk() {
		System.out.println("Estou andando!!");
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
}
