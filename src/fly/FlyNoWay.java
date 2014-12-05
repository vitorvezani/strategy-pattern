package fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Não posso voar :(");
	}

}
