package task2;

public class Fish implements WaterMoveable {

	@Override
	public void move() {
		System.out.println("Fish is moving.");		
	}

	
	
	@Override
	public void moveUnderWater() {
		System.out.println("Fish is moving under water.");
		
	}


}
