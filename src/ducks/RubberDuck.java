package ducks;
import quack.QuackPiu;
import fly.FlyNoWay;


public class RubberDuck extends Duck {

	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new QuackPiu());
	}

}
