package ducks;
import quack.QuackWa;
import fly.FlyWithWings;


public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new QuackWa());
	}

}
