package main;

import ducks.Duck;
import ducks.MallardDuck;
import ducks.RubberDuck;
import fly.FlyNoWay;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		System.out.println(mallardDuck.getClass() + " says!");
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		// Trocar o behavior on the fly!
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		
		Duck rubberDuck = new RubberDuck();
		System.out.println(rubberDuck.getClass() + " says!");
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}

}
